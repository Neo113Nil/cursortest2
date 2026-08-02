package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.InputFilter;
import android.widget.TextView;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vk1 {

    /* JADX INFO: renamed from: a */
    public static final C0745tx f8208a = new C0745tx(0);

    /* JADX INFO: renamed from: b */
    public static final u81 f8209b = new u81();

    /* JADX INFO: renamed from: c */
    public static final v81 f8210c = new v81();

    /* JADX INFO: renamed from: d */
    public static u90 f8211d;

    /* JADX INFO: renamed from: a */
    public static final void m5166a(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                vt1.m5190a(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Object m5167c(zq0 zq0Var, rw0 rw0Var, Serializable serializable) {
        zq0Var.getClass();
        rw0Var.getClass();
        Object objCopyOf = zq0Var.f9907a.get(rw0Var);
        if (objCopyOf instanceof byte[]) {
            byte[] bArr = (byte[]) objCopyOf;
            objCopyOf = Arrays.copyOf(bArr, bArr.length);
        }
        return objCopyOf == null ? serializable : objCopyOf;
    }

    /* JADX INFO: renamed from: d */
    public static SharedPreferences m5168d(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: renamed from: f */
    public static Executor m5169f(Executor executor, a40 a40Var) {
        executor.getClass();
        return executor == EnumC0113ct.f1449j ? executor : new bl0(executor, a40Var);
    }

    /* JADX INFO: renamed from: i */
    public static void m5170i(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InputFilter[] mo489b(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: e */
    public abstract Object mo843e(Intent intent, int i);

    /* JADX INFO: renamed from: g */
    public abstract void mo490g(boolean z);

    /* JADX INFO: renamed from: h */
    public abstract void mo491h(boolean z);
}
