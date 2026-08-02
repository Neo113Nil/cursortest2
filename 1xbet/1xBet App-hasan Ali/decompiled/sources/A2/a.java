package A2;

import E2.m;
import java.io.File;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f605a;

    public a(boolean z3) {
        this.f605a = z3;
    }

    @Override // A2.b
    public final String a(Object obj, m mVar) {
        File file = (File) obj;
        if (!this.f605a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
