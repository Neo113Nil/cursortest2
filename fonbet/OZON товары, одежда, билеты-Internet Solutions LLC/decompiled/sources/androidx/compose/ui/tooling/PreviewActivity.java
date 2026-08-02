package androidx.compose.ui.tooling;

import a1.C4912a;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ActivityC5043j;
import e.C6233h;
import kotlin.Metadata;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/j;", "<init>", "()V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PreviewActivity extends ActivityC5043j {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f41120h = "PreviewActivity";

    @Override // androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i11 = getApplicationInfo().flags & 2;
        String str = this.f41120h;
        if (i11 == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String n02 = h.n0('.', stringExtra, stringExtra);
        String j02 = h.j0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + j02 + "' without a parameter provider.");
            C6233h.a(this, new C4912a(true, -840626948, new a(n02, j02)));
            return;
        }
        Log.d(str, "Previewing '" + j02 + "' with parameter provider: '" + stringExtra2 + '\'');
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e11) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e11);
            cls = null;
        }
        Object[] a11 = W1.c.a(getIntent().getIntExtra("parameterProviderIndex", -1), cls);
        if (a11.length > 1) {
            C6233h.a(this, new C4912a(true, -861939235, new e(n02, j02, a11)));
        } else {
            C6233h.a(this, new C4912a(true, -1901447514, new f(n02, j02, a11)));
        }
    }
}
