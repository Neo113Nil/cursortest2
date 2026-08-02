package androidx.profileinstaller;

import A0.f;
import A0.i;
import L0.b;
import android.content.Context;
import e6.C1054c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // L0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // L0.b
    public final Object b(Context context) {
        i.a(new f(0, this, context.getApplicationContext()));
        return new C1054c(1);
    }
}
