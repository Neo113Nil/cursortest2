package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.internal.C0711g;
import com.haryanvi.netstream.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "Companion", "a", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class FacebookActivity extends FragmentActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public Fragment a;

    /* renamed from: com.facebook.FacebookActivity$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(writer, "writer");
            com.facebook.internal.logging.dumpsys.a.Companion.getClass();
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.a;
        if (fragment != null) {
            fragment.onConfigurationChanged(newConfig);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.facebook.internal.g] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.facebook.login.v vVar;
        String string;
        String string2;
        C0728q c0728q;
        boolean equals;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!w.q.get()) {
            com.facebook.internal.E e = com.facebook.internal.E.a;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            synchronized (w.class) {
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                w.j(applicationContext);
            }
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (!Intrinsics.areEqual("PassThrough", intent.getAction())) {
            Intent intent2 = getIntent();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("SingleFragment");
            if (findFragmentByTag == null) {
                if (Intrinsics.areEqual("FacebookDialogFragment", intent2.getAction())) {
                    ?? c0711g = new C0711g();
                    c0711g.setRetainInstance(true);
                    c0711g.show(supportFragmentManager, "SingleFragment");
                    vVar = c0711g;
                } else {
                    com.facebook.login.v vVar2 = new com.facebook.login.v();
                    vVar2.setRetainInstance(true);
                    supportFragmentManager.beginTransaction().add(R.id.com_facebook_fragment_container, vVar2, "SingleFragment").commit();
                    vVar = vVar2;
                }
                findFragmentByTag = vVar;
            }
            this.a = findFragmentByTag;
            return;
        }
        Intent requestIntent = getIntent();
        Intrinsics.checkNotNullExpressionValue(requestIntent, "requestIntent");
        Bundle i = com.facebook.internal.w.i(requestIntent);
        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.internal.w.class) && i != null) {
            try {
                string = i.getString("error_type");
                if (string == null) {
                    string = i.getString("com.facebook.platform.status.ERROR_TYPE");
                }
                string2 = i.getString("error_description");
                if (string2 == null) {
                    string2 = i.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.internal.w.class);
            }
            if (string != null) {
                equals = StringsKt__StringsJVMKt.equals(string, "UserCanceled", true);
                if (equals) {
                    c0728q = new C0729s(string2);
                    Intent intent3 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent3, "intent");
                    setResult(0, com.facebook.internal.w.f(intent3, null, c0728q));
                    finish();
                }
            }
            c0728q = new C0728q(string2);
            Intent intent32 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent32, "intent");
            setResult(0, com.facebook.internal.w.f(intent32, null, c0728q));
            finish();
        }
        c0728q = null;
        Intent intent322 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent322, "intent");
        setResult(0, com.facebook.internal.w.f(intent322, null, c0728q));
        finish();
    }
}
