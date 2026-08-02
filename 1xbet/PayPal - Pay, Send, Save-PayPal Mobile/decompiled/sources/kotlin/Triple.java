package kotlin;

@kotlin.js.JsImplicitExport(couldBeConvertedToExplicitExport = true)
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ@\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0007\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\b\u001a\u00028\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lkotlin/Triple;", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "first", "second", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getFirst", "getSecond", "getThird"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Triple<A, B, C> implements java.io.Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a2, B b, C c) {
        this.first = a2;
        this.second = b;
        this.third = c;
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

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(this.first);
        sb.append(", ");
        sb.append(this.second);
        sb.append(", ");
        sb.append(this.third);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        A a2 = this.first;
        int hashCode = a2 == null ? 0 : a2.hashCode();
        B b = this.second;
        int hashCode2 = b == null ? 0 : b.hashCode();
        C c = this.third;
        return (((hashCode * 31) + hashCode2) * 31) + (c != null ? c.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlin.Triple)) {
            return false;
        }
        kotlin.Triple triple = (kotlin.Triple) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.first, triple.first) && kotlin.jvm.internal.Intrinsics.areEqual(this.second, triple.second) && kotlin.jvm.internal.Intrinsics.areEqual(this.third, triple.third);
    }

    public final kotlin.Triple<A, B, C> copy(A first, B second, C third) {
        return new kotlin.Triple<>(first, second, third);
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
    public static /* synthetic */ kotlin.Triple copy$default(kotlin.Triple triple, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, java.lang.Object obj4) {
        if ((i & 1) != 0) {
            obj = triple.first;
        }
        if ((i & 2) != 0) {
            obj2 = triple.second;
        }
        if ((i & 4) != 0) {
            obj3 = triple.third;
        }
        return triple.copy(obj, obj2, obj3);
    }
}
