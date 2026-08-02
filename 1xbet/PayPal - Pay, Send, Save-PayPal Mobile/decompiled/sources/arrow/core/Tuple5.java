package arrow.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 &*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u0001*\u0006\b\u0004\u0010\u0005 \u00012\u00020\u0006:\u0001&B/\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\t\u001a\u00028\u0002\u0012\u0006\u0010\n\u001a\u00028\u0003\u0012\u0006\u0010\u000b\u001a\u00028\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00028\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J`\u0010\u0017\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00028\u00022\b\b\u0002\u0010\n\u001a\u00028\u00032\b\b\u0002\u0010\u000b\u001a\u00028\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\b\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0012R\u001a\u0010\t\u001a\u00028\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\u0012R\u001a\u0010\n\u001a\u00028\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b$\u0010\u0012R\u001a\u0010\u000b\u001a\u00028\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b%\u0010\u0012"}, d2 = {"Larrow/core/Tuple5;", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "D", "E", "", "first", "second", "third", "fourth", "fifth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Larrow/core/Tuple5;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getFirst", "getSecond", "getThird", "getFourth", "getFifth", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Tuple5<A, B, C, D, E> {
    private final E fifth;
    private final A first;
    private final D fourth;
    private final B second;
    private final C third;

    public Tuple5(A a2, B b, C c, D d, E e) {
        this.first = a2;
        this.second = b;
        this.third = c;
        this.fourth = d;
        this.fifth = e;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public final D getFourth() {
        return this.fourth;
    }

    public final E getFifth() {
        return this.fifth;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(this.first);
        sb.append(", ");
        sb.append(this.second);
        sb.append(", ");
        sb.append(this.third);
        sb.append(", ");
        sb.append(this.fourth);
        sb.append(", ");
        sb.append(this.fifth);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        A a2 = this.first;
        int hashCode = a2 == null ? 0 : a2.hashCode();
        B b = this.second;
        int hashCode2 = b == null ? 0 : b.hashCode();
        C c = this.third;
        int hashCode3 = c == null ? 0 : c.hashCode();
        D d = this.fourth;
        int hashCode4 = d == null ? 0 : d.hashCode();
        E e = this.fifth;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (e != null ? e.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof arrow.core.Tuple5)) {
            return false;
        }
        arrow.core.Tuple5 tuple5 = (arrow.core.Tuple5) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.first, tuple5.first) && kotlin.jvm.internal.Intrinsics.areEqual(this.second, tuple5.second) && kotlin.jvm.internal.Intrinsics.areEqual(this.third, tuple5.third) && kotlin.jvm.internal.Intrinsics.areEqual(this.fourth, tuple5.fourth) && kotlin.jvm.internal.Intrinsics.areEqual(this.fifth, tuple5.fifth);
    }

    public final arrow.core.Tuple5<A, B, C, D, E> copy(A first, B second, C third, D fourth, E fifth) {
        return new arrow.core.Tuple5<>(first, second, third, fourth, fifth);
    }

    public final E component5() {
        return this.fifth;
    }

    public final D component4() {
        return this.fourth;
    }

    public final C component3() {
        return this.third;
    }

    public final B component2() {
        return this.second;
    }

    public final A component1() {
        return this.first;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ arrow.core.Tuple5 copy$default(arrow.core.Tuple5 tuple5, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i, java.lang.Object obj6) {
        A a2 = obj;
        if ((i & 1) != 0) {
            a2 = tuple5.first;
        }
        B b = obj2;
        if ((i & 2) != 0) {
            b = tuple5.second;
        }
        B b2 = b;
        C c = obj3;
        if ((i & 4) != 0) {
            c = tuple5.third;
        }
        C c2 = c;
        D d = obj4;
        if ((i & 8) != 0) {
            d = tuple5.fourth;
        }
        D d2 = d;
        E e = obj5;
        if ((i & 16) != 0) {
            e = tuple5.fifth;
        }
        return tuple5.copy(a2, b2, c2, d2, e);
    }
}
