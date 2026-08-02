package com.neptunesoft.bacdz;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.neptunesoft.bacdz.database.DataBase;
import com.neptunesoft.bacdz.entities.Note;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.io.FileUtils;

/* loaded from: classes4.dex */
public class CreateNoteActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_SELECT_IMAGE = 2;
    private static final int REQUEST_CODE_STORAGE_PERMISSION = 1;
    private Note alreadyAvailableNote;
    private AlertDialog dialogAddUrl;
    private AlertDialog dialogDeleteNote;
    private EditText edittextnote;
    private EditText edittextsubtitle;
    private EditText edittexttitle;
    private ImageView imageNote;
    String imgPathFromQuick;
    ImageView imgback;
    ImageView imgsave;
    private LinearLayout layoutWebUrl;
    private String selectedImagePath;
    private String selectedNoteColor;
    private TextView textWebUrl;
    private TextView textvdatetime;
    private View viewsubtitle;
    Handler handler = new Handler();
    boolean noteExist = false;
    boolean imgFromQuick = false;
    int indexTable = 0;
    String[] imagesTable = new String[0];
    String firstImageName = null;
    Runnable showKeyBoard = new Runnable() { // from class: com.neptunesoft.bacdz.CreateNoteActivity.1
        @Override // java.lang.Runnable
        public void run() {
            CreateNoteActivity.show_keyboard(CreateNoteActivity.this);
            CreateNoteActivity.this.handler.removeCallbacks(CreateNoteActivity.this.showKeyBoard);
        }
    };
    Runnable hideLayoutMiscellaneous = new Runnable() { // from class: com.neptunesoft.bacdz.CreateNoteActivity.2
        @Override // java.lang.Runnable
        public void run() {
            CreateNoteActivity.this.hideLayoutMiscellaneous();
            CreateNoteActivity.this.handler.removeCallbacks(CreateNoteActivity.this.hideLayoutMiscellaneous);
        }
    };

    static /* synthetic */ void lambda$showAddUrlDialog$26(DialogInterface dialogInterface, int i) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda6
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return CreateNoteActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.imgback = (ImageView) findViewById(R.id.imgback);
        this.imgsave = (ImageView) findViewById(R.id.imgsave);
        this.edittextsubtitle = (EditText) findViewById(R.id.edittextsubtitle);
        this.edittexttitle = (EditText) findViewById(R.id.edittexttitle);
        this.edittextnote = (EditText) findViewById(R.id.edittextnote);
        this.textvdatetime = (TextView) findViewById(R.id.textvdatetime);
        this.viewsubtitle = findViewById(R.id.viewsubtitle);
        this.imageNote = (ImageView) findViewById(R.id.imageNote);
        this.textWebUrl = (TextView) findViewById(R.id.textWebUrl);
        this.layoutWebUrl = (LinearLayout) findViewById(R.id.layoutWebUrl);
        refreshUI();
        this.textvdatetime.setText(new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm a", Locale.getDefault()).format(new Date()));
        this.imgback.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m559lambda$onCreate$1$comneptunesoftbacdzCreateNoteActivity(view);
            }
        });
        this.imgsave.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m562lambda$onCreate$2$comneptunesoftbacdzCreateNoteActivity(view);
            }
        });
        this.selectedNoteColor = "#8E94F2";
        this.selectedImagePath = "";
        if (getIntent().getBooleanExtra("isViewOrUpdate", false)) {
            Note note = (Note) getIntent().getSerializableExtra("note");
            this.alreadyAvailableNote = note;
            this.firstImageName = note.getImage_path();
            this.noteExist = true;
            setViewOrUpdateNote();
        }
        findViewById(R.id.imageRemoveWebUrl).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m563lambda$onCreate$3$comneptunesoftbacdzCreateNoteActivity(view);
            }
        });
        findViewById(R.id.imageRemoveImage).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m564lambda$onCreate$4$comneptunesoftbacdzCreateNoteActivity(view);
            }
        });
        if (getIntent().getBooleanExtra("isFromQuickActions", false) && (stringExtra = getIntent().getStringExtra("quickActionType")) != null) {
            if (stringExtra.equals("image")) {
                this.imgFromQuick = true;
                this.imgPathFromQuick = getIntent().getStringExtra("imagePath");
                String stringExtra2 = getIntent().getStringExtra("imagePath");
                this.selectedImagePath = stringExtra2;
                this.imageNote.setImageBitmap(BitmapFactory.decodeFile(stringExtra2));
                this.imageNote.setVisibility(0);
                findViewById(R.id.imageRemoveImage).setVisibility(0);
            } else if (stringExtra.equals(ImagesContract.URL)) {
                this.textWebUrl.setText(getIntent().getStringExtra(ImagesContract.URL));
                this.layoutWebUrl.setVisibility(0);
            }
        }
        initMiscellaneous();
        setSubtitleIndicatorColor();
        this.imageNote.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m565lambda$onCreate$5$comneptunesoftbacdzCreateNoteActivity(view);
            }
        });
        this.edittextsubtitle.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CreateNoteActivity.this.m566lambda$onCreate$6$comneptunesoftbacdzCreateNoteActivity(view, z);
            }
        });
        this.edittexttitle.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda15
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CreateNoteActivity.this.m567lambda$onCreate$7$comneptunesoftbacdzCreateNoteActivity(view, z);
            }
        });
        this.edittextnote.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda16
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CreateNoteActivity.this.m568lambda$onCreate$8$comneptunesoftbacdzCreateNoteActivity(view, z);
            }
        });
        this.edittextsubtitle.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m569lambda$onCreate$9$comneptunesoftbacdzCreateNoteActivity(view);
            }
        });
        this.edittexttitle.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m560lambda$onCreate$10$comneptunesoftbacdzCreateNoteActivity(view);
            }
        });
        this.edittextnote.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m561lambda$onCreate$11$comneptunesoftbacdzCreateNoteActivity(view);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets platformInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).toPlatformInsets();
            i = platformInsets.left;
            i2 = platformInsets.top;
            i3 = platformInsets.right;
            i4 = platformInsets.bottom;
            view.setPadding(i, i2, i3, i4);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m559lambda$onCreate$1$comneptunesoftbacdzCreateNoteActivity(View view) {
        hideLayoutMiscellaneous();
        super.onBackPressed();
        for (String str : this.imagesTable) {
            if (!str.equals(this.firstImageName)) {
                delete_file(str);
            }
        }
        if (this.imgFromQuick && !this.imgPathFromQuick.equals("")) {
            delete_file(getFileName(this.imgPathFromQuick) + getFileExtension(this.imgPathFromQuick));
        }
        if (this.noteExist || this.selectedImagePath.equals("")) {
            return;
        }
        delete_file(getFileName(this.selectedImagePath) + getFileExtension(this.selectedImagePath));
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m562lambda$onCreate$2$comneptunesoftbacdzCreateNoteActivity(View view) {
        hideLayoutMiscellaneous();
        saveNote();
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m563lambda$onCreate$3$comneptunesoftbacdzCreateNoteActivity(View view) {
        this.textWebUrl.setText((CharSequence) null);
        this.layoutWebUrl.setVisibility(8);
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m564lambda$onCreate$4$comneptunesoftbacdzCreateNoteActivity(View view) {
        this.imageNote.setImageBitmap(null);
        this.imageNote.setVisibility(8);
        findViewById(R.id.imageRemoveImage).setVisibility(8);
        this.selectedImagePath = "";
    }

    /* renamed from: lambda$onCreate$5$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m565lambda$onCreate$5$comneptunesoftbacdzCreateNoteActivity(View view) {
        this.handler.postDelayed(this.hideLayoutMiscellaneous, 100L);
    }

    /* renamed from: lambda$onCreate$6$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m566lambda$onCreate$6$comneptunesoftbacdzCreateNoteActivity(View view, boolean z) {
        this.handler.postDelayed(this.hideLayoutMiscellaneous, 100L);
    }

    /* renamed from: lambda$onCreate$7$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m567lambda$onCreate$7$comneptunesoftbacdzCreateNoteActivity(View view, boolean z) {
        this.handler.postDelayed(this.hideLayoutMiscellaneous, 100L);
    }

    /* renamed from: lambda$onCreate$8$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m568lambda$onCreate$8$comneptunesoftbacdzCreateNoteActivity(View view, boolean z) {
        this.handler.postDelayed(this.hideLayoutMiscellaneous, 100L);
    }

    /* renamed from: lambda$onCreate$9$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m569lambda$onCreate$9$comneptunesoftbacdzCreateNoteActivity(View view) {
        this.handler.postDelayed(this.hideLayoutMiscellaneous, 100L);
    }

    /* renamed from: lambda$onCreate$10$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m560lambda$onCreate$10$comneptunesoftbacdzCreateNoteActivity(View view) {
        this.handler.postDelayed(this.hideLayoutMiscellaneous, 100L);
    }

    /* renamed from: lambda$onCreate$11$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m561lambda$onCreate$11$comneptunesoftbacdzCreateNoteActivity(View view) {
        this.handler.postDelayed(this.hideLayoutMiscellaneous, 100L);
    }

    private boolean hasImage(ImageView view) {
        Drawable drawable = view.getDrawable();
        boolean z = drawable != null;
        return (z && (drawable instanceof BitmapDrawable)) ? ((BitmapDrawable) drawable).getBitmap() != null : z;
    }

    void hideLayoutMiscellaneous() {
        BottomSheetBehavior.from((LinearLayout) findViewById(R.id.layoutMiscellaneous)).setState(4);
    }

    void refreshUI() {
        ImageView imageView = (ImageView) findViewById(R.id.imgback);
        ImageView imageView2 = (ImageView) findViewById(R.id.imgsave);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutMiscellaneous);
        ImageView imageView3 = (ImageView) findViewById(R.id.miscellaneousWebLink);
        ImageView imageView4 = (ImageView) findViewById(R.id.miscellaneousImage);
        if (SplashScreen.darkmode) {
            imageView.setImageResource(R.drawable.ic_back_dark);
            imageView2.setImageResource(R.drawable.ic_done_dark);
            imageView2.setBackgroundResource(R.drawable.background_done_button_dark);
            linearLayout.setBackgroundResource(R.drawable.backgroundmiscellaneous_dark);
            imageView3.setImageResource(R.drawable.ic_weblink_dark);
            imageView4.setImageResource(R.drawable.ic_image_dark);
            return;
        }
        imageView.setImageResource(R.drawable.ic_back);
        imageView2.setImageResource(R.drawable.ic_done);
        imageView2.setBackgroundResource(R.drawable.background_done_button);
        linearLayout.setBackgroundResource(R.drawable.backgroundmiscellaneous);
        imageView3.setImageResource(R.drawable.ic_weblink);
        imageView4.setImageResource(R.drawable.ic_image);
    }

    private void setViewOrUpdateNote() {
        this.edittexttitle.setText(this.alreadyAvailableNote.getTitle());
        this.edittextsubtitle.setText(this.alreadyAvailableNote.getSubtitle());
        this.edittextnote.setText(this.alreadyAvailableNote.getNote_content());
        this.textvdatetime.setText(this.alreadyAvailableNote.getDate_time());
        if (this.alreadyAvailableNote.getImage_path() != null && !this.alreadyAvailableNote.getImage_path().trim().isEmpty()) {
            this.imageNote.setImageBitmap(BitmapFactory.decodeFile(this.alreadyAvailableNote.getImage_path()));
            if (hasImage(this.imageNote)) {
                this.imageNote.setVisibility(0);
                findViewById(R.id.imageRemoveImage).setVisibility(0);
                this.selectedImagePath = this.alreadyAvailableNote.getImage_path();
            }
        }
        if (this.alreadyAvailableNote.getWeb_link() == null || this.alreadyAvailableNote.getWeb_link().trim().isEmpty()) {
            return;
        }
        this.textWebUrl.setText(this.alreadyAvailableNote.getWeb_link());
        this.layoutWebUrl.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [com.neptunesoft.bacdz.CreateNoteActivity$1saveNoteTask] */
    private void saveNote() {
        if (this.edittexttitle.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "لا يمكنك حفظ هذه الملاحظة بدون عنوان !.", 1).show();
            return;
        }
        if (this.edittextsubtitle.getText().toString().trim().isEmpty() && this.edittextnote.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "لا يمكنك حفظ هذه الملاحظة و هي فارغة, قم بإدخال عنوان فرعي أو أي محتوى تود حفظه أو كلاهما !.", 1).show();
            return;
        }
        final Note note = new Note();
        note.setTitle(this.edittexttitle.getText().toString());
        note.setSubtitle(this.edittextsubtitle.getText().toString());
        note.setNote_content(this.edittextnote.getText().toString());
        note.setDate_time(this.textvdatetime.getText().toString());
        note.setColor(this.selectedNoteColor);
        note.setImage_path(this.selectedImagePath);
        if (this.layoutWebUrl.getVisibility() == 0) {
            note.setWeb_link(this.textWebUrl.getText().toString());
        }
        Note note2 = this.alreadyAvailableNote;
        if (note2 != null) {
            note.setId_note(note2.getId_note());
        }
        for (String str : this.imagesTable) {
            delete_file(str);
        }
        new AsyncTask<Void, Void, Void>() { // from class: com.neptunesoft.bacdz.CreateNoteActivity.1saveNoteTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voids) {
                DataBase.getDataBase(CreateNoteActivity.this.getApplicationContext()).noteDao().insertNote(note);
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(Void aVoid) {
                super.onPostExecute((C1saveNoteTask) aVoid);
                CreateNoteActivity.this.setResult(-1, new Intent());
                CreateNoteActivity.this.finish();
            }
        }.execute(new Void[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010d, code lost:
    
        if (r0.equals("#4BB3FD") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void initMiscellaneous() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutMiscellaneous);
        final BottomSheetBehavior from = BottomSheetBehavior.from(linearLayout);
        linearLayout.findViewById(R.id.textMiscellaneous).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.lambda$initMiscellaneous$12(BottomSheetBehavior.this, view);
            }
        });
        char c = 0;
        if (this.alreadyAvailableNote != null) {
            linearLayout.findViewById(R.id.layoutDeleteNote).setVisibility(0);
            linearLayout.findViewById(R.id.layoutDeleteNote).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda23
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateNoteActivity.this.m551x72b1384d(from, view);
                }
            });
        }
        final ImageView imageView = (ImageView) linearLayout.findViewById(R.id.imageColorCornflowerblue);
        final ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.imageColormarigold);
        final ImageView imageView3 = (ImageView) linearLayout.findViewById(R.id.imageColorfeiryrose);
        final ImageView imageView4 = (ImageView) linearLayout.findViewById(R.id.imageColortartorange);
        final ImageView imageView5 = (ImageView) linearLayout.findViewById(R.id.imageColorbluejeans);
        linearLayout.findViewById(R.id.colorCornflowerblue).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda24
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m552x7a166d6c(imageView, imageView2, imageView3, imageView4, imageView5, view);
            }
        });
        linearLayout.findViewById(R.id.colormarigold).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m553x817ba28b(imageView, imageView2, imageView3, imageView4, imageView5, view);
            }
        });
        linearLayout.findViewById(R.id.colorfeiryrose).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m554x88e0d7aa(imageView, imageView2, imageView3, imageView4, imageView5, view);
            }
        });
        linearLayout.findViewById(R.id.colortartorange).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m555x90460cc9(imageView, imageView2, imageView3, imageView4, imageView5, view);
            }
        });
        linearLayout.findViewById(R.id.colorbluejeans).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m556x97ab41e8(imageView, imageView2, imageView3, imageView4, imageView5, view);
            }
        });
        Note note = this.alreadyAvailableNote;
        if (note != null && note.getColor() != null && !this.alreadyAvailableNote.getColor().trim().isEmpty()) {
            String color = this.alreadyAvailableNote.getColor();
            color.hashCode();
            switch (color.hashCode()) {
                case -1745423840:
                    break;
                case -1284838285:
                    if (color.equals("#DE9E36")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1242461905:
                    if (color.equals("#F56476")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1226835182:
                    if (color.equals("#FF3E41")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    linearLayout.findViewById(R.id.colorbluejeans).performClick();
                    break;
                case 1:
                    linearLayout.findViewById(R.id.colormarigold).performClick();
                    break;
                case 2:
                    linearLayout.findViewById(R.id.colorfeiryrose).performClick();
                    break;
                case 3:
                    linearLayout.findViewById(R.id.colortartorange).performClick();
                    break;
                default:
                    linearLayout.findViewById(R.id.colorCornflowerblue).performClick();
                    break;
            }
        }
        linearLayout.findViewById(R.id.layoutAddImage).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m557x9f107707(from, view);
            }
        });
        linearLayout.findViewById(R.id.layoutAddUrl).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m558x41c307b1(from, view);
            }
        });
    }

    static /* synthetic */ void lambda$initMiscellaneous$12(BottomSheetBehavior bottomSheetBehavior, View view) {
        if (bottomSheetBehavior.getState() != 3) {
            bottomSheetBehavior.setState(3);
        } else {
            bottomSheetBehavior.setState(4);
        }
    }

    /* renamed from: lambda$initMiscellaneous$13$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m551x72b1384d(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.setState(4);
        showDeleteNoteDialog();
    }

    /* renamed from: lambda$initMiscellaneous$14$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m552x7a166d6c(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, View view) {
        this.selectedNoteColor = "#8E94F2";
        imageView.setImageResource(R.drawable.ic_done);
        imageView2.setImageResource(0);
        imageView3.setImageResource(0);
        imageView4.setImageResource(0);
        imageView5.setImageResource(0);
        setSubtitleIndicatorColor();
    }

    /* renamed from: lambda$initMiscellaneous$15$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m553x817ba28b(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, View view) {
        this.selectedNoteColor = "#DE9E36";
        imageView.setImageResource(0);
        imageView2.setImageResource(R.drawable.ic_done);
        imageView3.setImageResource(0);
        imageView4.setImageResource(0);
        imageView5.setImageResource(0);
        setSubtitleIndicatorColor();
    }

    /* renamed from: lambda$initMiscellaneous$16$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m554x88e0d7aa(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, View view) {
        this.selectedNoteColor = "#F56476";
        imageView.setImageResource(0);
        imageView2.setImageResource(0);
        imageView3.setImageResource(R.drawable.ic_done);
        imageView4.setImageResource(0);
        imageView5.setImageResource(0);
        setSubtitleIndicatorColor();
    }

    /* renamed from: lambda$initMiscellaneous$17$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m555x90460cc9(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, View view) {
        this.selectedNoteColor = "#FF3E41";
        imageView.setImageResource(0);
        imageView2.setImageResource(0);
        imageView3.setImageResource(0);
        imageView4.setImageResource(R.drawable.ic_done);
        imageView5.setImageResource(0);
        setSubtitleIndicatorColor();
    }

    /* renamed from: lambda$initMiscellaneous$18$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m556x97ab41e8(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, View view) {
        this.selectedNoteColor = "#4BB3FD";
        imageView.setImageResource(0);
        imageView2.setImageResource(0);
        imageView3.setImageResource(0);
        imageView4.setImageResource(0);
        imageView5.setImageResource(R.drawable.ic_done);
        setSubtitleIndicatorColor();
    }

    /* renamed from: lambda$initMiscellaneous$19$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m557x9f107707(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.setState(4);
        if (ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        } else {
            selectImage();
        }
    }

    /* renamed from: lambda$initMiscellaneous$20$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m558x41c307b1(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.setState(4);
        showAddUrlDialog();
    }

    public static String getFileExtension(final String path) {
        if (path == null || path.lastIndexOf(46) == -1) {
            return null;
        }
        return path.substring(path.lastIndexOf(46));
    }

    public static String getFileName(String path) {
        try {
            return path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf(46));
        } catch (Exception e) {
            e.printStackTrace();
            return path.substring(path.lastIndexOf("/") + 1);
        }
    }

    public void delete_file(String FILE_NAME) {
        File file = new File(getFilesDir(), FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
    }

    private void showDeleteNoteDialog() {
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialogDeleteNote = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda18
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CreateNoteActivity.this.m573x27eed06e(dialogInterface);
            }
        });
        this.dialogDeleteNote.setMessage("هل تريد حذف هذه الملاحظة ؟.");
        this.dialogDeleteNote.setButton(-1, "حذف", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda19
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateNoteActivity.this.m574x2f54058d(dialogInterface, i);
            }
        });
        this.dialogDeleteNote.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda20
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialogDeleteNote.show();
    }

    /* renamed from: lambda$showDeleteNoteDialog$21$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m573x27eed06e(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialogDeleteNote.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.dialogDeleteNote.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.neptunesoft.bacdz.CreateNoteActivity$1DeleteNoteTask] */
    /* renamed from: lambda$showDeleteNoteDialog$22$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m574x2f54058d(DialogInterface dialogInterface, int i) {
        this.dialogDeleteNote.dismiss();
        if (!this.alreadyAvailableNote.getImage_path().equals("") && this.alreadyAvailableNote.getImage_path() != null) {
            delete_file(getFileName(this.alreadyAvailableNote.getImage_path()) + getFileExtension(this.alreadyAvailableNote.getImage_path()));
        }
        new AsyncTask<Void, Void, Void>() { // from class: com.neptunesoft.bacdz.CreateNoteActivity.1DeleteNoteTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voids) {
                DataBase.getDataBase(CreateNoteActivity.this.getApplicationContext()).noteDao().deleteNote(CreateNoteActivity.this.alreadyAvailableNote);
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(Void aVoid) {
                super.onPostExecute((C1DeleteNoteTask) aVoid);
                Intent intent = new Intent();
                intent.putExtra("isNoteDeleted", true);
                CreateNoteActivity.this.setResult(-1, intent);
                CreateNoteActivity.this.finish();
            }
        }.execute(new Void[0]);
    }

    private void setSubtitleIndicatorColor() {
        ((GradientDrawable) this.viewsubtitle.getBackground()).setColor(Color.parseColor(this.selectedNoteColor));
    }

    private void selectImage() {
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 2);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != 1 || grantResults.length <= 0) {
            return;
        }
        if (grantResults[0] == 0) {
            selectImage();
        } else {
            Toast.makeText(this, "تم رفض الصلاحية الخاصة بالوصول إلى ملفات الجهاز, إذا قمت برفض هذه الصلاحية بشكل نهائي يمكنك إعادة تفعيلها من الإعدادات الخاصة بالجهاز.", 1).show();
        }
    }

    private String getRealPathFromURI(Uri uri) {
        Cursor query = getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        if (query == null) {
            return null;
        }
        int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
        query.moveToFirst();
        String string = query.getString(columnIndexOrThrow);
        query.close();
        return string;
    }

    public boolean files_exist(String fileName) {
        return new File(getFilesDir(), fileName).exists();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri data2;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 2 || resultCode != -1 || data == null || (data2 = data.getData()) == null) {
            return;
        }
        String realPathFromURI = getRealPathFromURI(data2);
        String fileName = getFileName(data2.getPath());
        String str = fileName + getFileExtension(data2.getPath());
        int i = 1;
        while (files_exist(str)) {
            str = fileName + i + getFileExtension(data2.getPath());
            i++;
        }
        try {
            String insertInPrivateStorage = insertInPrivateStorage(str, realPathFromURI);
            if (!insertInPrivateStorage.equals("")) {
                this.imageNote.setImageBitmap(BitmapFactory.decodeFile(insertInPrivateStorage));
                this.imageNote.setVisibility(0);
                findViewById(R.id.imageRemoveImage).setVisibility(0);
                if (!this.selectedImagePath.equals("")) {
                    String str2 = getFileName(this.selectedImagePath) + getFileExtension(this.selectedImagePath);
                    int i2 = this.indexTable + 1;
                    this.indexTable = i2;
                    String[] strArr = this.imagesTable;
                    String[] strArr2 = new String[i2];
                    this.imagesTable = strArr2;
                    System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                    this.imagesTable[strArr.length] = str2;
                }
                this.selectedImagePath = insertInPrivateStorage;
                return;
            }
            this.imageNote.setImageBitmap(BitmapFactory.decodeStream(getContentResolver().openInputStream(data2)));
            this.imageNote.setVisibility(0);
            findViewById(R.id.imageRemoveImage).setVisibility(0);
            if (!this.selectedImagePath.equals("")) {
                String str3 = getFileName(this.selectedImagePath) + getFileExtension(this.selectedImagePath);
                int i3 = this.indexTable + 1;
                this.indexTable = i3;
                String[] strArr3 = this.imagesTable;
                String[] strArr4 = new String[i3];
                this.imagesTable = strArr4;
                System.arraycopy(strArr3, 0, strArr4, 0, strArr3.length);
                this.imagesTable[strArr3.length] = str3;
            }
            this.selectedImagePath = getPathFromUri(data2);
        } catch (Exception e) {
            Toast.makeText(this, "خطأ :" + e.getMessage(), 1).show();
        }
    }

    private String insertInPrivateStorage(String fileName, String path) throws IOException {
        FileOutputStream openFileOutput = openFileOutput(fileName, 0);
        openFileOutput.write(getBytesFromFile(new File(path)));
        openFileOutput.close();
        return getFilesDir() + "/" + fileName;
    }

    private byte[] getBytesFromFile(File file) throws IOException {
        return FileUtils.readFileToByteArray(file);
    }

    private String getPathFromUri(Uri uri) {
        Cursor query = getContentResolver().query(uri, null, null, null, null);
        if (query == null) {
            return uri.getPath();
        }
        query.moveToFirst();
        String string = query.getString(query.getColumnIndex("_data"));
        query.close();
        return string;
    }

    private void showAddUrlDialog() {
        hide_keyboard(this);
        this.dialogAddUrl = new AlertDialog.Builder(this).create();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = LayoutInflater.from(this).inflate(R.layout.layout_add_url, (ViewGroup) findViewById(R.id.layoutAddUrlContainer));
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.dialogAddUrl = create;
        create.setCancelable(false);
        this.dialogAddUrl.setMessage("إضافة رابط");
        final EditText editText = (EditText) inflate.findViewById(R.id.editTextUrl);
        this.dialogAddUrl.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CreateNoteActivity.this.m571x1c03947b(editText, dialogInterface);
            }
        });
        this.dialogAddUrl.setButton(-1, "إضافة", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateNoteActivity.lambda$showAddUrlDialog$26(dialogInterface, i);
            }
        });
        this.dialogAddUrl.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateNoteActivity.this.m572x2acdfeb9(dialogInterface, i);
            }
        });
        editText.setText("");
        editText.requestFocus(0);
        this.dialogAddUrl.show();
        this.handler.postDelayed(this.showKeyBoard, 400L);
    }

    /* renamed from: lambda$showAddUrlDialog$25$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m571x1c03947b(final EditText editText, DialogInterface dialogInterface) {
        Button button = this.dialogAddUrl.getButton(-1);
        if (!SplashScreen.darkmode) {
            this.dialogAddUrl.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
            this.dialogAddUrl.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CreateNoteActivity$$ExternalSyntheticLambda21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNoteActivity.this.m570x149e5f5c(editText, view);
            }
        });
    }

    /* renamed from: lambda$showAddUrlDialog$24$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m570x149e5f5c(EditText editText, View view) {
        if (editText.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "قم بإدخال الرابط !.", 0).show();
        } else {
            if (!Patterns.WEB_URL.matcher(editText.getText().toString()).matches()) {
                Toast.makeText(this, "قم بإدخال رابط صحيح !.", 0).show();
                return;
            }
            this.textWebUrl.setText(editText.getText().toString());
            this.layoutWebUrl.setVisibility(0);
            this.dialogAddUrl.dismiss();
        }
    }

    /* renamed from: lambda$showAddUrlDialog$27$com-neptunesoft-bacdz-CreateNoteActivity, reason: not valid java name */
    /* synthetic */ void m572x2acdfeb9(DialogInterface dialogInterface, int i) {
        this.dialogAddUrl.dismiss();
    }

    public static void show_keyboard(Activity activity) {
        ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(0, 1);
    }

    public static void hide_keyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        for (String str : this.imagesTable) {
            if (!str.equals(this.firstImageName)) {
                delete_file(str);
            }
        }
        if (this.imgFromQuick && !this.imgPathFromQuick.equals("")) {
            delete_file(getFileName(this.imgPathFromQuick) + getFileExtension(this.imgPathFromQuick));
        }
        if (this.noteExist || this.selectedImagePath.equals("")) {
            return;
        }
        delete_file(getFileName(this.selectedImagePath) + getFileExtension(this.selectedImagePath));
    }
}
