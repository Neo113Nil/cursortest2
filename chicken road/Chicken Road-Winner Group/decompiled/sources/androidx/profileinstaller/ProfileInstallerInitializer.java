package androidx.profileinstaller;

import D1.a;
import P0.j;
import S.h;
import W.b;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // W.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // W.b
    public final Object create(Context context) {
        h.a(new a(this, 4, context.getApplicationContext()));
        return new j(19);
    }
}
