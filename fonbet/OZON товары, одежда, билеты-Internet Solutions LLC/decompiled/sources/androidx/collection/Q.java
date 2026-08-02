package androidx.collection;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class Q<E> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public Object[] f38646a;

    /* renamed from: b, reason: collision with root package name */
    public int f38647b;

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<E, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q<E> f38648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Q<E> q11) {
            super(1);
            this.f38648b = q11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Object obj) {
            return obj == this.f38648b ? "(this)" : String.valueOf(obj);
        }
    }

    public final int a(E e11) {
        int i11 = 0;
        if (e11 == null) {
            Object[] objArr = this.f38646a;
            int i12 = this.f38647b;
            while (i11 < i12) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        Object[] objArr2 = this.f38646a;
        int i13 = this.f38647b;
        while (i11 < i13) {
            if (e11.equals(objArr2[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q) {
            Q q11 = (Q) obj;
            int i11 = q11.f38647b;
            int i12 = this.f38647b;
            if (i11 == i12) {
                Object[] objArr = this.f38646a;
                Object[] objArr2 = q11.f38646a;
                IntRange o11 = kotlin.ranges.h.o(0, i12);
                int f71842a = o11.getF71842a();
                int f71843b = o11.getF71843b();
                if (f71842a > f71843b) {
                    return true;
                }
                while (Intrinsics.d(objArr[f71842a], objArr2[f71842a])) {
                    if (f71842a == f71843b) {
                        return true;
                    }
                    f71842a++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f38646a;
        int i11 = this.f38647b;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            i12 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i12;
    }

    @NotNull
    public final String toString() {
        a aVar = new a(this);
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f38646a;
        int i11 = this.f38647b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i12];
            if (i12 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i12 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) aVar.invoke(obj));
            i12++;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
