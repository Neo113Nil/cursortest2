package com.neptunesoft.bacdz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.neptunesoft.bacdz.classobjects.Mark;

/* loaded from: classes4.dex */
public class ShowEditMarkActivity extends AppCompatActivity {
    static Mark mark;
    Button btnEditSave;
    boolean edit = false;
    EditText editTextArticle;
    EditText editTextAssumption;
    EditText editTextBehavior;
    EditText editTextFactor;
    EditText editTextTest;
    ImageView imageViewShowEditMark;
    TextView txtTitle;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_edit_mark);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.ShowEditMarkActivity$$ExternalSyntheticLambda3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ShowEditMarkActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.txtTitle = (TextView) findViewById(R.id.txtTitle);
        this.imageViewShowEditMark = (ImageView) findViewById(R.id.imageViewShowEditMark);
        this.editTextArticle = (EditText) findViewById(R.id.editTextArticle);
        this.editTextFactor = (EditText) findViewById(R.id.editTextFactor);
        this.editTextBehavior = (EditText) findViewById(R.id.editTextBehavior);
        this.editTextAssumption = (EditText) findViewById(R.id.editTextAssumption);
        this.editTextTest = (EditText) findViewById(R.id.editTextTest);
        this.btnEditSave = (Button) findViewById(R.id.btnEditSave);
        String article = mark.getArticle();
        article.hashCode();
        switch (article) {
            case "رياضيات":
                this.txtTitle.setText("مادة الرياضيات");
                break;
            case "ت.بدنية":
                this.txtTitle.setText("مادة التربية البدنية");
                break;
            case "ع.فيزيائية":
                this.txtTitle.setText("مادة العلوم الفيزيائية");
                break;
            case "ل.عربية":
                this.txtTitle.setText("مادة اللغة العربية");
                break;
            case "ل.أمازيغية":
                this.txtTitle.setText("مادة اللغة الأمازيغية");
                break;
            case "ع.إسلامية":
                this.txtTitle.setText("مادة العلوم الإسلامية");
                break;
            case "إجتماعيات":
                this.txtTitle.setText("مادة الإجتماعيات");
                break;
            case "ل.إنجليزية":
                this.txtTitle.setText("مادة اللغة الإنجليزية");
                break;
            case "فلسفة":
                this.txtTitle.setText("مادة الفلسفة");
                break;
            case "ل.فرنسية":
                this.txtTitle.setText("مادة اللغة الفرنسية");
                break;
            default:
                this.txtTitle.setText("مادة العلوم الطبيعية");
                break;
        }
        this.editTextArticle.setText(mark.getArticle());
        this.editTextFactor.setText(Integer.toString(mark.getFactor()));
        this.editTextBehavior.setText(Double.toString(mark.getBehavior()));
        this.editTextAssumption.setText(Double.toString(mark.getAssumption()));
        this.editTextTest.setText(Double.toString(mark.getTest()));
        refreshUI();
        this.btnEditSave.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.ShowEditMarkActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShowEditMarkActivity.this.m745lambda$onCreate$1$comneptunesoftbacdzShowEditMarkActivity(view);
            }
        });
        this.editTextTest.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.neptunesoft.bacdz.ShowEditMarkActivity$$ExternalSyntheticLambda5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ShowEditMarkActivity.this.m746lambda$onCreate$2$comneptunesoftbacdzShowEditMarkActivity(textView, i, keyEvent);
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

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x0108
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0165 -> B:16:0x01dc). Please report as a decompilation issue!!! */
    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-ShowEditMarkActivity, reason: not valid java name */
    /* synthetic */ void m745lambda$onCreate$1$comneptunesoftbacdzShowEditMarkActivity(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neptunesoft.bacdz.ShowEditMarkActivity.m745lambda$onCreate$1$comneptunesoftbacdzShowEditMarkActivity(android.view.View):void");
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-bacdz-ShowEditMarkActivity, reason: not valid java name */
    /* synthetic */ boolean m746lambda$onCreate$2$comneptunesoftbacdzShowEditMarkActivity(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.btnEditSave.callOnClick();
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.edit) {
            super.onBackPressed();
            return;
        }
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.ShowEditMarkActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ShowEditMarkActivity.this.m743x1ab7adaa(create, dialogInterface);
            }
        });
        create.setMessage("هل تريد تجاهل عملية التعديل ؟.");
        create.setButton(-1, "تجاهل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.ShowEditMarkActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShowEditMarkActivity.this.m744xdda41709(dialogInterface, i);
            }
        });
        create.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.ShowEditMarkActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$onBackPressed$3$com-neptunesoft-bacdz-ShowEditMarkActivity, reason: not valid java name */
    /* synthetic */ void m743x1ab7adaa(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$onBackPressed$4$com-neptunesoft-bacdz-ShowEditMarkActivity, reason: not valid java name */
    /* synthetic */ void m744xdda41709(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        super.onBackPressed();
        finish();
    }

    void refreshUI() {
        this.editTextArticle.setElevation(10.0f);
        this.editTextAssumption.setElevation(10.0f);
        this.editTextBehavior.setElevation(10.0f);
        this.editTextFactor.setElevation(10.0f);
        this.editTextTest.setElevation(10.0f);
        if (SplashScreen.darkmode) {
            this.imageViewShowEditMark.setImageResource(R.drawable.ic_showeditmarks_dark);
            this.editTextArticle.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editTextAssumption.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editTextBehavior.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editTextFactor.setBackgroundResource(R.drawable.background_edittext_dark);
            this.editTextTest.setBackgroundResource(R.drawable.background_edittext_dark);
            return;
        }
        this.imageViewShowEditMark.setImageResource(R.drawable.ic_showeditmarks);
        this.editTextArticle.setBackgroundResource(R.drawable.background_edittext);
        this.editTextAssumption.setBackgroundResource(R.drawable.background_edittext);
        this.editTextBehavior.setBackgroundResource(R.drawable.background_edittext);
        this.editTextFactor.setBackgroundResource(R.drawable.background_edittext);
        this.editTextTest.setBackgroundResource(R.drawable.background_edittext);
    }

    public static void show_keyboard(Activity activity) {
        ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(0, 1);
    }
}
