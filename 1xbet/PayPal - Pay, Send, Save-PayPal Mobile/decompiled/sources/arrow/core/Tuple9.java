package arrow.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 6*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u0001*\u0006\b\u0004\u0010\u0005 \u0001*\u0006\b\u0005\u0010\u0006 \u0001*\u0006\b\u0006\u0010\u0007 \u0001*\u0006\b\u0007\u0010\b \u0001*\u0006\b\b\u0010\t \u00012\u00020\n:\u00016BO\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00028\u0001\u0012\u0006\u0010\r\u001a\u00028\u0002\u0012\u0006\u0010\u000e\u001a\u00028\u0003\u0012\u0006\u0010\u000f\u001a\u00028\u0004\u0012\u0006\u0010\u0010\u001a\u00028\u0005\u0012\u0006\u0010\u0011\u001a\u00028\u0006\u0012\u0006\u0010\u0012\u001a\u00028\u0007\u0012\u0006\u0010\u0013\u001a\u00028\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00028\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00028\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00028\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00028\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00028\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ \u0001\u0010#\u001a8\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u00002\b\b\u0002\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00028\u00012\b\b\u0002\u0010\r\u001a\u00028\u00022\b\b\u0002\u0010\u000e\u001a\u00028\u00032\b\b\u0002\u0010\u000f\u001a\u00028\u00042\b\b\u0002\u0010\u0010\u001a\u00028\u00052\b\b\u0002\u0010\u0011\u001a\u00028\u00062\b\b\u0002\u0010\u0012\u001a\u00028\u00072\b\b\u0002\u0010\u0013\u001a\u00028\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u001aR\u001a\u0010\f\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b.\u0010\u001aR\u001a\u0010\r\u001a\u00028\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b/\u0010\u001aR\u001a\u0010\u000e\u001a\u00028\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b0\u0010\u001aR\u001a\u0010\u000f\u001a\u00028\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b1\u0010\u001aR\u001a\u0010\u0010\u001a\u00028\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b2\u0010\u001aR\u001a\u0010\u0011\u001a\u00028\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b3\u0010\u001aR\u001a\u0010\u0012\u001a\u00028\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b4\u0010\u001aR\u001a\u0010\u0013\u001a\u00028\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b5\u0010\u001a"}, d2 = {"Larrow/core/Tuple9;", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "D", "E", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "G", "H", com.visa.cbp.getEncExpo.warmup, "", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Larrow/core/Tuple9;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getFirst", "getSecond", "getThird", "getFourth", "getFifth", "getSixth", "getSeventh", "getEighth", "getNinth", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Tuple9<A, B, C, D, E, F, G, H, I> {
    private final H eighth;
    private final E fifth;
    private final A first;
    private final D fourth;
    private final I ninth;
    private final B second;
    private final G seventh;
    private final F sixth;
    private final C third;

    public Tuple9(A a2, B b, C c, D d, E e, F f, G g, H h, I i) {
        this.first = a2;
        this.second = b;
        this.third = c;
        this.fourth = d;
        this.fifth = e;
        this.sixth = f;
        this.seventh = g;
        this.eighth = h;
        this.ninth = i;
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

    public final I getNinth() {
        return this.ninth;
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
        sb.append(", ");
        sb.append(this.ninth);
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
        int hashCode8 = h == null ? 0 : h.hashCode();
        I i = this.ninth;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (i != null ? i.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof arrow.core.Tuple9)) {
            return false;
        }
        arrow.core.Tuple9 tuple9 = (arrow.core.Tuple9) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.first, tuple9.first) && kotlin.jvm.internal.Intrinsics.areEqual(this.second, tuple9.second) && kotlin.jvm.internal.Intrinsics.areEqual(this.third, tuple9.third) && kotlin.jvm.internal.Intrinsics.areEqual(this.fourth, tuple9.fourth) && kotlin.jvm.internal.Intrinsics.areEqual(this.fifth, tuple9.fifth) && kotlin.jvm.internal.Intrinsics.areEqual(this.sixth, tuple9.sixth) && kotlin.jvm.internal.Intrinsics.areEqual(this.seventh, tuple9.seventh) && kotlin.jvm.internal.Intrinsics.areEqual(this.eighth, tuple9.eighth) && kotlin.jvm.internal.Intrinsics.areEqual(this.ninth, tuple9.ninth);
    }

    public final arrow.core.Tuple9<A, B, C, D, E, F, G, H, I> copy(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth, I ninth) {
        return new arrow.core.Tuple9<>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth);
    }

    public final I component9() {
        return this.ninth;
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
