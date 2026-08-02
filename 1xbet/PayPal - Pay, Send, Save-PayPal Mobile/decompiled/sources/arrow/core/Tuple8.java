package arrow.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 2*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u0001*\u0006\b\u0004\u0010\u0005 \u0001*\u0006\b\u0005\u0010\u0006 \u0001*\u0006\b\u0006\u0010\u0007 \u0001*\u0006\b\u0007\u0010\b \u00012\u00020\t:\u00012BG\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00028\u0001\u0012\u0006\u0010\f\u001a\u00028\u0002\u0012\u0006\u0010\r\u001a\u00028\u0003\u0012\u0006\u0010\u000e\u001a\u00028\u0004\u0012\u0006\u0010\u000f\u001a\u00028\u0005\u0012\u0006\u0010\u0010\u001a\u00028\u0006\u0012\u0006\u0010\u0011\u001a\u00028\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00028\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00028\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00028\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00028\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0090\u0001\u0010 \u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u00002\b\b\u0002\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00028\u00022\b\b\u0002\u0010\r\u001a\u00028\u00032\b\b\u0002\u0010\u000e\u001a\u00028\u00042\b\b\u0002\u0010\u000f\u001a\u00028\u00052\b\b\u0002\u0010\u0010\u001a\u00028\u00062\b\b\u0002\u0010\u0011\u001a\u00028\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u000b\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b+\u0010\u0018R\u001a\u0010\f\u001a\u00028\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b,\u0010\u0018R\u001a\u0010\r\u001a\u00028\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b-\u0010\u0018R\u001a\u0010\u000e\u001a\u00028\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b.\u0010\u0018R\u001a\u0010\u000f\u001a\u00028\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b/\u0010\u0018R\u001a\u0010\u0010\u001a\u00028\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b0\u0010\u0018R\u001a\u0010\u0011\u001a\u00028\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b1\u0010\u0018"}, d2 = {"Larrow/core/Tuple8;", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "D", "E", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "G", "H", "", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Larrow/core/Tuple8;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getFirst", "getSecond", "getThird", "getFourth", "getFifth", "getSixth", "getSeventh", "getEighth", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Tuple8<A, B, C, D, E, F, G, H> {
    private final H eighth;
    private final E fifth;
    private final A first;
    private final D fourth;
    private final B second;
    private final G seventh;
    private final F sixth;
    private final C third;

    public Tuple8(A a2, B b, C c, D d, E e, F f, G g, H h) {
        this.first = a2;
        this.second = b;
        this.third = c;
        this.fourth = d;
        this.fifth = e;
        this.sixth = f;
        this.seventh = g;
        this.eighth = h;
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

    public final F getSixth() {
        return this.sixth;
    }

    public final G getSeventh() {
        return this.seventh;
    }

    public final H getEighth() {
        return this.eighth;
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
        sb.append(", ");
        sb.append(this.sixth);
        sb.append(", ");
        sb.append(this.seventh);
        sb.append(", ");
        sb.append(this.eighth);
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
        int hashCode5 = e == null ? 0 : e.hashCode();
        F f = this.sixth;
        int hashCode6 = f == null ? 0 : f.hashCode();
        G g = this.seventh;
        int hashCode7 = g == null ? 0 : g.hashCode();
        H h = this.eighth;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (h != null ? h.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof arrow.core.Tuple8)) {
            return false;
        }
        arrow.core.Tuple8 tuple8 = (arrow.core.Tuple8) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.first, tuple8.first) && kotlin.jvm.internal.Intrinsics.areEqual(this.second, tuple8.second) && kotlin.jvm.internal.Intrinsics.areEqual(this.third, tuple8.third) && kotlin.jvm.internal.Intrinsics.areEqual(this.fourth, tuple8.fourth) && kotlin.jvm.internal.Intrinsics.areEqual(this.fifth, tuple8.fifth) && kotlin.jvm.internal.Intrinsics.areEqual(this.sixth, tuple8.sixth) && kotlin.jvm.internal.Intrinsics.areEqual(this.seventh, tuple8.seventh) && kotlin.jvm.internal.Intrinsics.areEqual(this.eighth, tuple8.eighth);
    }

    public final arrow.core.Tuple8<A, B, C, D, E, F, G, H> copy(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth) {
        return new arrow.core.Tuple8<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    public final H component8() {
        return this.eighth;
    }

    public final G component7() {
        return this.seventh;
    }

    public final F component6() {
        return this.sixth;
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
}
