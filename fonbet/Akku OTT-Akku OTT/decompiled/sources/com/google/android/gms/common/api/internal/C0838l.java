package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;

/* renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0838l<L> {
    public final HandlerExecutor a;

    @Nullable
    public volatile Object b;

    @Nullable
    public volatile a c;

    /* renamed from: com.google.android.gms.common.api.internal.l$a */
    public static final class a<L> {
        public final Object a;
        public final String b;

        public a(L l, String str) {
            this.a = l;
            this.b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.l$b */
    public interface b<L> {
        void notifyListener(@NonNull L l);

        void onNotifyListenerFailed();
    }

    public C0838l(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.a = new HandlerExecutor(looper);
        C0875q.h(l, "Listener must not be null");
        this.b = l;
        C0875q.d(str);
        this.c = new a(l, str);
    }
}
