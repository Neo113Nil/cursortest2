package arrow.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u00020\u0005:\u0001\"B'\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JP\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u00022\b\b\u0002\u0010\t\u001a\u00028\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0007\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\b\u001a\u00028\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u0010R\u001a\u0010\t\u001a\u00028\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b!\u0010\u0010"}, d2 = {"Larrow/core/Tuple4;", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "D", "", "first", "second", "third", "fourth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Larrow/core/Tuple4;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getFirst", "getSecond", "getThird", "getFourth", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Tuple4<A, B, C, D> {
    private final A first;
    private final D fourth;
    private final B second;
    private final C third;

    public Tuple4(A a2, B b, C c, D d) {
        this.first = a2;
        this.second = b;
        this.third = c;
        this.fourth = d;
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

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(this.first);
        sb.append(", ");
        sb.append(this.second);
        sb.append(", ");
        sb.append(this.third);
        sb.append(", ");
        sb.append(this.fourth);
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
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (d != null ? d.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof arrow.core.Tuple4)) {
            return false;
        }
        arrow.core.Tuple4 tuple4 = (arrow.core.Tuple4) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.first, tuple4.first) && kotlin.jvm.internal.Intrinsics.areEqual(this.second, tuple4.second) && kotlin.jvm.internal.Intrinsics.areEqual(this.third, tuple4.third) && kotlin.jvm.internal.Intrinsics.areEqual(this.fourth, tuple4.fourth);
    }

    public final arrow.core.Tuple4<A, B, C, D> copy(A first, B second, C third, D fourth) {
        return new arrow.core.Tuple4<>(first, second, third, fourth);
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
    public static /* synthetic */ arrow.core.Tuple4 copy$default(arrow.core.Tuple4 tuple4, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, java.lang.Object obj5) {
        if ((i & 1) != 0) {
            obj = tuple4.first;
        }
        if ((i & 2) != 0) {
            obj2 = tuple4.second;
        }
        if ((i & 4) != 0) {
            obj3 = tuple4.third;
        }
        if ((i & 8) != 0) {
            obj4 = tuple4.fourth;
        }
        return tuple4.copy(obj, obj2, obj3, obj4);
    }
}
