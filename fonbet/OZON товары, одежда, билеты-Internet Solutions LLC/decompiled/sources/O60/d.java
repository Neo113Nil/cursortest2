package O60;

import Jb.e;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements e<Moshi> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f20010a = new d();
    }

    @Override // Pc.a
    public final Object get() {
        Moshi moshi = new Moshi(new Moshi.a());
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        return moshi;
    }
}
