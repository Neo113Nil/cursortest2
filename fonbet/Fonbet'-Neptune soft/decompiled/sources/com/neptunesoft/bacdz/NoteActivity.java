package com.neptunesoft.bacdz;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Insets;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import com.neptunesoft.bacdz.adapter.NoteAdapter;
import com.neptunesoft.bacdz.database.DataBase;
import com.neptunesoft.bacdz.entities.Note;
import com.neptunesoft.bacdz.listeners.NotesListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* loaded from: classes4.dex */
public class NoteActivity extends AppCompatActivity implements NotesListener {
    public static final int Request_Code_Add_Note = 1;
    public static final int Request_Code_SELECT_IMAGE = 4;
    public static final int Request_Code_SHOW_Note = 3;
    public static final int Request_Code_STORAGE_PERMISSION = 5;
    public static final int Request_UPDATE_Note = 2;
    AlertDialog dialogAddUrl;
    EditText edittextSearch;
    ImageView floating_addnote;
    ImageView img_clear;
    ImageView img_filter_color;
    private NoteAdapter noteAdapter;
    private List<Note> noteList;
    private RecyclerView notesRecyclerView;
    Handler handler = new Handler();
    public int noteClickPosition = -1;
    Runnable showKeyBoard = new Runnable() { // from class: com.neptunesoft.bacdz.NoteActivity.2
        @Override // java.lang.Runnable
        public void run() {
            NoteActivity.show_keyboard(NoteActivity.this);
            NoteActivity.this.handler.removeCallbacks(NoteActivity.this.showKeyBoard);
        }
    };

    static /* synthetic */ void lambda$showAddUrlDialog$10(DialogInterface dialogInterface, int i) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda12
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return NoteActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.floating_addnote = (ImageView) findViewById(R.id.floating_addnote);
        refreshUI();
        this.floating_addnote.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteActivity.this.m668lambda$onCreate$1$comneptunesoftbacdzNoteActivity(view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.noteRecyclerView);
        this.notesRecyclerView = recyclerView;
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        this.noteList = new ArrayList();
        NoteAdapter noteAdapter = new NoteAdapter(this.noteList, this);
        this.noteAdapter = noteAdapter;
        this.notesRecyclerView.setAdapter(noteAdapter);
        getNotes(3, false);
        this.edittextSearch = (EditText) findViewById(R.id.edittextSearch);
        this.img_clear = (ImageView) findViewById(R.id.img_clear);
        this.img_filter_color = (ImageView) findViewById(R.id.img_filter_color);
        this.img_clear.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteActivity.this.m669lambda$onCreate$2$comneptunesoftbacdzNoteActivity(view);
            }
        });
        this.img_filter_color.setVisibility(0);
        this.edittextSearch.addTextChangedListener(new TextWatcher() { // from class: com.neptunesoft.bacdz.NoteActivity.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                NoteActivity.this.img_filter_color.setImageResource(R.drawable.ic_all_colors);
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                NoteActivity.this.noteAdapter.cancelTimer();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (NoteActivity.this.noteList.size() != 0) {
                    NoteActivity.this.noteAdapter.searchNotes(s.toString(), false);
                }
                if (s.toString().equals("")) {
                    NoteActivity.this.img_clear.setVisibility(8);
                    NoteActivity.this.img_filter_color.setVisibility(0);
                } else {
                    NoteActivity.this.img_clear.setVisibility(0);
                    NoteActivity.this.img_filter_color.setVisibility(8);
                }
            }
        });
        findViewById(R.id.imageTasks).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteActivity.this.m670lambda$onCreate$3$comneptunesoftbacdzNoteActivity(view);
            }
        });
        findViewById(R.id.imageaddimage).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteActivity.this.m671lambda$onCreate$4$comneptunesoftbacdzNoteActivity(view);
            }
        });
        this.img_filter_color.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteActivity.this.m673lambda$onCreate$6$comneptunesoftbacdzNoteActivity(view);
            }
        });
        findViewById(R.id.imageaddlink).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteActivity.this.m674lambda$onCreate$7$comneptunesoftbacdzNoteActivity(view);
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

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /* synthetic */ void m668lambda$onCreate$1$comneptunesoftbacdzNoteActivity(View view) {
        this.edittextSearch.setText("");
        this.img_filter_color.setImageResource(R.drawable.ic_all_colors);
        this.noteAdapter.cancelTimer();
        startActivityForResult(new Intent(this, (Class<?>) CreateNoteActivity.class), 1);
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /* synthetic */ void m669lambda$onCreate$2$comneptunesoftbacdzNoteActivity(View view) {
        this.edittextSearch.setText("");
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /* synthetic */ void m670lambda$onCreate$3$comneptunesoftbacdzNoteActivity(View view) {
        startActivity(new Intent(this, (Class<?>) TasksActivity.class));
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /* synthetic */ void m671lambda$onCreate$4$comneptunesoftbacdzNoteActivity(View view) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_IMAGES") != 0) {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_MEDIA_IMAGES"}, 5);
                return;
            } else {
                selectImage();
                return;
            }
        }
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 5);
        } else {
            selectImage();
        }
    }

    /* renamed from: lambda$onCreate$6$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /* synthetic */ void m673lambda$onCreate$6$comneptunesoftbacdzNoteActivity(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu_filter_note, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda7
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return NoteActivity.this.m672lambda$onCreate$5$comneptunesoftbacdzNoteActivity(menuItem);
            }
        });
        popupMenu.show();
        popupMenu.setForceShowIcon(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0087, code lost:
    
        return true;
     */
    /* renamed from: lambda$onCreate$5$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ boolean m672lambda$onCreate$5$comneptunesoftbacdzNoteActivity(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.item_all /* 2131362187 */:
                this.edittextSearch.setText("");
                this.img_filter_color.setImageResource(R.drawable.ic_all_colors);
                this.noteAdapter.cancelTimer();
                break;
            case R.id.item_bluejeans /* 2131362188 */:
                this.edittextSearch.setText("");
                this.img_filter_color.setImageResource(R.drawable.ic_note_bluejeans);
                this.noteAdapter.searchNotes("#4BB3FD", true);
                break;
            case R.id.item_cornflowerblue /* 2131362190 */:
                this.edittextSearch.setText("");
                this.img_filter_color.setImageResource(R.drawable.ic_note_cornflowerblue);
                this.noteAdapter.searchNotes("#8E94F2", true);
                break;
            case R.id.item_feiryrose /* 2131362193 */:
                this.edittextSearch.setText("");
                this.img_filter_color.setImageResource(R.drawable.ic_note_feiryrose);
                this.noteAdapter.searchNotes("#F56476", true);
                break;
            case R.id.item_marigold /* 2131362194 */:
                this.edittextSearch.setText("");
                this.img_filter_color.setImageResource(R.drawable.ic_note_marigold);
                this.noteAdapter.searchNotes("#DE9E36", true);
                break;
            case R.id.item_tartorange /* 2131362198 */:
                this.edittextSearch.setText("");
                this.img_filter_color.setImageResource(R.drawable.ic_note_tartorange);
                this.noteAdapter.searchNotes("#FF3E41", true);
                break;
        }
    }

    /* renamed from: lambda$onCreate$7$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /* synthetic */ void m674lambda$onCreate$7$comneptunesoftbacdzNoteActivity(View view) {
        showAddUrlDialog();
    }

    void refreshUI() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutSearch);
        ImageView imageView = (ImageView) findViewById(R.id.img_search);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.lytquickaction);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageaddimage);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageaddlink);
        ImageView imageView4 = (ImageView) findViewById(R.id.img_clear);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageTasks);
        if (SplashScreen.darkmode) {
            linearLayout.setBackgroundResource(R.drawable.background_search_dark);
            imageView.setImageResource(R.drawable.ic_search_dark);
            linearLayout2.setBackgroundColor(Color.parseColor("#464547"));
            imageView2.setImageResource(R.drawable.ic_image_dark);
            imageView3.setImageResource(R.drawable.ic_weblink_dark);
            imageView4.setImageResource(R.drawable.ic_clear_search_content_dark);
            imageView5.setImageResource(R.drawable.ic_clipboard_tasks_dark);
            return;
        }
        linearLayout.setBackgroundResource(R.drawable.background_search);
        imageView.setImageResource(R.drawable.ic_search);
        linearLayout2.setBackgroundColor(Color.parseColor("#E0DFE6"));
        imageView2.setImageResource(R.drawable.ic_image);
        imageView3.setImageResource(R.drawable.ic_weblink);
        imageView4.setImageResource(R.drawable.ic_clear_search_content);
        imageView5.setImageResource(R.drawable.ic_clipboard_tasks);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != 5 || grantResults.length <= 0) {
            return;
        }
        if (grantResults[0] == 0) {
            selectImage();
        } else {
            Toast.makeText(this, "تم رفض الصلاحية الخاصة بالوصول إلى ملفات الجهاز, إذا قمت برفض هذه الصلاحية بشكل نهائي يمكنك إعادة تفعيلها من الإعدادات الخاصة بالجهاز.", 1).show();
        }
    }

    private void selectImage() {
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 4);
        }
    }

    @Override // com.neptunesoft.bacdz.listeners.NotesListener
    public void onNoteClick(Note note, int position) {
        this.noteClickPosition = position;
        Intent intent = new Intent(this, (Class<?>) CreateNoteActivity.class);
        intent.putExtra("isViewOrUpdate", true);
        intent.putExtra("note", note);
        startActivityForResult(intent, 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.neptunesoft.bacdz.NoteActivity$1GetNoteTask] */
    private void getNotes(final int request, final boolean isNoteDeleted) {
        new AsyncTask<Void, Void, List<Note>>() { // from class: com.neptunesoft.bacdz.NoteActivity.1GetNoteTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public List<Note> doInBackground(Void... voids) {
                return DataBase.getDataBase(NoteActivity.this.getApplicationContext()).noteDao().getAllNotes();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(List<Note> notes) {
                super.onPostExecute((C1GetNoteTask) notes);
                int i = request;
                if (i == 3) {
                    NoteActivity.this.noteList.addAll(notes);
                    NoteActivity.this.noteAdapter.notifyDataSetChanged();
                } else if (i == 1) {
                    NoteActivity.this.noteList.add(0, notes.get(0));
                    NoteActivity.this.noteAdapter.notifyItemInserted(0);
                    NoteActivity.this.notesRecyclerView.smoothScrollToPosition(0);
                } else if (i == 2) {
                    NoteActivity.this.noteList.remove(NoteActivity.this.noteClickPosition);
                    if (isNoteDeleted) {
                        NoteActivity.this.noteAdapter.notifyItemRemoved(NoteActivity.this.noteClickPosition);
                    } else {
                        NoteActivity.this.noteList.add(NoteActivity.this.noteClickPosition, notes.get(NoteActivity.this.noteClickPosition));
                        NoteActivity.this.noteAdapter.notifyItemChanged(NoteActivity.this.noteClickPosition);
                    }
                }
                NoteActivity.this.notesRecyclerView.smoothScrollToPosition(0);
            }
        }.execute(new Void[0]);
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

    public boolean files_exist(String fileName) {
        return new File(getFilesDir(), fileName).exists();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri data2;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            getNotes(1, false);
            return;
        }
        if (requestCode == 2 && resultCode == -1) {
            if (data != null) {
                getNotes(2, data.getBooleanExtra("isNoteDeleted", false));
                return;
            }
            return;
        }
        if (requestCode != 4 || resultCode != -1 || data == null || (data2 = data.getData()) == null) {
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
            Intent intent = new Intent(this, (Class<?>) CreateNoteActivity.class);
            intent.putExtra("isFromQuickActions", true);
            intent.putExtra("quickActionType", "image");
            if (!insertInPrivateStorage.equals("")) {
                intent.putExtra("imagePath", insertInPrivateStorage);
            } else {
                intent.putExtra("imagePath", data2);
            }
            this.edittextSearch.setText("");
            this.img_filter_color.setImageResource(R.drawable.ic_all_colors);
            this.noteAdapter.cancelTimer();
            startActivityForResult(intent, 1);
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
        this.dialogAddUrl.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                NoteActivity.this.m677lambda$showAddUrlDialog$9$comneptunesoftbacdzNoteActivity(editText, dialogInterface);
            }
        });
        this.dialogAddUrl.setButton(-1, "إضافة", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NoteActivity.lambda$showAddUrlDialog$10(dialogInterface, i);
            }
        });
        this.dialogAddUrl.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NoteActivity.this.m675lambda$showAddUrlDialog$11$comneptunesoftbacdzNoteActivity(dialogInterface, i);
            }
        });
        editText.setText("");
        editText.requestFocus(0);
        this.dialogAddUrl.show();
        this.handler.postDelayed(this.showKeyBoard, 400L);
    }

    /* renamed from: lambda$showAddUrlDialog$9$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /* synthetic */ void m677lambda$showAddUrlDialog$9$comneptunesoftbacdzNoteActivity(final EditText editText, DialogInterface dialogInterface) {
        Button button = this.dialogAddUrl.getButton(-1);
        if (!SplashScreen.darkmode) {
            this.dialogAddUrl.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
            this.dialogAddUrl.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.NoteActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteActivity.this.m676lambda$showAddUrlDialog$8$comneptunesoftbacdzNoteActivity(editText, view);
            }
        });
    }

    /* renamed from: lambda$showAddUrlDialog$8$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /* synthetic */ void m676lambda$showAddUrlDialog$8$comneptunesoftbacdzNoteActivity(EditText editText, View view) {
        if (editText.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "قم بإدخال الرابط !.", 0).show();
            return;
        }
        if (!Patterns.WEB_URL.matcher(editText.getText().toString()).matches()) {
            Toast.makeText(this, "قم بإدخال رابط صحيح !.", 0).show();
            return;
        }
        this.edittextSearch.setText("");
        this.img_filter_color.setImageResource(R.drawable.ic_all_colors);
        this.noteAdapter.cancelTimer();
        this.dialogAddUrl.dismiss();
        Intent intent = new Intent(this, (Class<?>) CreateNoteActivity.class);
        intent.putExtra("isFromQuickActions", true);
        intent.putExtra("quickActionType", ImagesContract.URL);
        intent.putExtra(ImagesContract.URL, editText.getText().toString());
        startActivityForResult(intent, 1);
    }

    /* renamed from: lambda$showAddUrlDialog$11$com-neptunesoft-bacdz-NoteActivity, reason: not valid java name */
    /* synthetic */ void m675lambda$showAddUrlDialog$11$comneptunesoftbacdzNoteActivity(DialogInterface dialogInterface, int i) {
        this.dialogAddUrl.dismiss();
    }

    public static void hide_keyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static void show_keyboard(Activity activity) {
        ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(0, 1);
    }
}
