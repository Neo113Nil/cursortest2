package U8;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Set;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f27458a = new HashMap();

    @KeepForSdk
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC10861a f27459a;

        @KeepForSdk
        public a(@NonNull InterfaceC10861a interfaceC10861a) {
            this.f27459a = interfaceC10861a;
        }

        final InterfaceC10861a a() {
            return this.f27459a;
        }
    }

    @KeepForSdk
    public c(@NonNull Set<a> set) {
        for (a aVar : set) {
            HashMap hashMap = this.f27458a;
            aVar.getClass();
            hashMap.put(U8.a.class, aVar.a());
        }
    }
}
