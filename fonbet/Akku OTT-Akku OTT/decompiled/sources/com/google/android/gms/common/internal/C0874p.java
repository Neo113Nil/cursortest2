package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0874p {

    /* renamed from: com.google.android.gms.common.internal.p$a */
    public static final class a {
        public final ArrayList a;
        public final Object b;

        public /* synthetic */ a(Object obj) {
            C0875q.g(obj);
            this.b = obj;
            this.a = new ArrayList();
        }

        @NonNull
        public final void a(@Nullable Object obj, @NonNull String str) {
            this.a.add(android.support.v4.media.session.f.b(str, "=", String.valueOf(obj)));
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) arrayList.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
