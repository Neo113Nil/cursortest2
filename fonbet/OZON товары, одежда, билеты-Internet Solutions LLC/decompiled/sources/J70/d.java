package J70;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements Jb.e<Moshi> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f14195a = new d();
    }

    @Override // Pc.a
    public final Object get() {
        Moshi moshi = new Moshi(new Moshi.a());
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        return moshi;
    }
}
