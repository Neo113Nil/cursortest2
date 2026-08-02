package p000;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.util.Collections;

/* JADX INFO: renamed from: s3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0678s3 implements h21, InterfaceC0350j8 {

    /* JADX INFO: renamed from: j */
    public int f7021j;

    /* JADX INFO: renamed from: k */
    public Object f7022k;

    public C0678s3(int i) {
        switch (i) {
            case 3:
                this.f7021j = 1;
                this.f7022k = Collections.singletonList(null);
                break;
            case 4:
                this.f7022k = new Object[256];
                break;
            case 5:
                this.f7022k = new int[10];
                break;
            default:
                this.f7022k = Bitmap.CompressFormat.JPEG;
                this.f7021j = 100;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public DialogInterfaceC0715t3 m4471a() {
        C0530o3 c0530o3 = (C0530o3) this.f7022k;
        DialogInterfaceC0715t3 dialogInterfaceC0715t3 = new DialogInterfaceC0715t3(c0530o3.f5586a, this.f7021j);
        View view = c0530o3.f5590e;
        C0641r3 c0641r3 = dialogInterfaceC0715t3.f7267p;
        if (view != null) {
            c0641r3.f6693u = view;
        } else {
            CharSequence charSequence = c0530o3.f5589d;
            if (charSequence != null) {
                c0641r3.f6676d = charSequence;
                TextView textView = c0641r3.f6691s;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0530o3.f5588c;
            if (drawable != null) {
                c0641r3.f6689q = drawable;
                ImageView imageView = c0641r3.f6690r;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0641r3.f6690r.setImageDrawable(drawable);
                }
            }
        }
        String str = c0530o3.f5591f;
        if (str != null) {
            c0641r3.f6677e = str;
            TextView textView2 = c0641r3.f6692t;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = c0530o3.f5592g;
        if (charSequence2 != null) {
            c0641r3.m4237b(-1, charSequence2, c0530o3.f5593h);
        }
        CharSequence charSequence3 = c0530o3.f5594i;
        if (charSequence3 != null) {
            c0641r3.m4237b(-2, charSequence3, c0530o3.f5595j);
        }
        if (c0530o3.f5597l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0530o3.f5587b.inflate(c0641r3.f6697y, (ViewGroup) null);
            int i = c0530o3.f5599n ? c0641r3.f6698z : c0641r3.f6669A;
            ListAdapter c0604q3 = c0530o3.f5597l;
            if (c0604q3 == null) {
                c0604q3 = new C0604q3(c0530o3.f5586a, i, R.id.text1, null);
            }
            c0641r3.f6694v = c0604q3;
            c0641r3.f6695w = c0530o3.f5600o;
            if (c0530o3.f5598m != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0493n3(c0530o3, c0641r3));
            }
            if (c0530o3.f5599n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0641r3.f6678f = alertController$RecycleListView;
        }
        dialogInterfaceC0715t3.setCancelable(true);
        dialogInterfaceC0715t3.setCanceledOnTouchOutside(true);
        dialogInterfaceC0715t3.setOnCancelListener(null);
        dialogInterfaceC0715t3.setOnDismissListener(null);
        pn0 pn0Var = c0530o3.f5596k;
        if (pn0Var != null) {
            dialogInterfaceC0715t3.setOnKeyListener(pn0Var);
        }
        return dialogInterfaceC0715t3;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4472b(int i) {
        return (this.f7021j & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: c */
    public void m4473c(C0129d8 c0129d8) {
        int i = this.f7021j;
        Object[] objArr = (Object[]) this.f7022k;
        if (i < objArr.length) {
            objArr[i] = c0129d8;
            this.f7021j = i + 1;
        }
    }

    @Override // p000.InterfaceC0350j8
    public /* synthetic */ ListenableFuture call() {
        return ((C0902y5) this.f7022k).m5740w(this.f7021j);
    }

    /* JADX INFO: renamed from: d */
    public void m4474d(int i, int i2) {
        int[] iArr = (int[]) this.f7022k;
        if (i >= iArr.length) {
            return;
        }
        this.f7021j = (1 << i) | this.f7021j;
        iArr[i] = i2;
    }

    @Override // p000.h21
    /* JADX INFO: renamed from: o */
    public v11 mo1764o(v11 v11Var, uu0 uu0Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) v11Var.get()).compress((Bitmap.CompressFormat) this.f7022k, this.f7021j, byteArrayOutputStream);
        v11Var.mo269e();
        return new C0310i4(byteArrayOutputStream.toByteArray());
    }

    public C0678s3(C0253gl c0253gl, int i) {
        p80.m3863h(c0253gl);
        this.f7022k = c0253gl;
        this.f7021j = i;
    }

    public /* synthetic */ C0678s3(int i, Object obj) {
        this.f7022k = obj;
        this.f7021j = i;
    }

    public C0678s3(Context context) {
        int iM4666h = DialogInterfaceC0715t3.m4666h(context, 0);
        this.f7022k = new C0530o3(new ContextThemeWrapper(context, DialogInterfaceC0715t3.m4666h(context, iM4666h)));
        this.f7021j = iM4666h;
    }
}
