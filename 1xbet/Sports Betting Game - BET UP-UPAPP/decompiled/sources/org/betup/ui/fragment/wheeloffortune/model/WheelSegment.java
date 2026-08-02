package org.betup.ui.fragment.wheeloffortune.model;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WheelSegment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lorg/betup/ui/fragment/wheeloffortune/model/WheelSegment;", "", "value", "", "color", "Landroidx/compose/ui/graphics/Color;", "text", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IJLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue", "()I", "getColor-0d7_KjU", "()J", "J", "getText", "()Ljava/lang/String;", "component1", "component2", "component2-0d7_KjU", "component3", "copy", "copy-bw27NRU", "(IJLjava/lang/String;)Lorg/betup/ui/fragment/wheeloffortune/model/WheelSegment;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WheelSegment {
    public static final int $stable = 0;
    private final long color;
    private final String text;
    private final int value;

    public /* synthetic */ WheelSegment(int i, long j, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, str);
    }

    /* renamed from: copy-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ WheelSegment m14320copybw27NRU$default(WheelSegment wheelSegment, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wheelSegment.value;
        }
        if ((i2 & 2) != 0) {
            j = wheelSegment.color;
        }
        if ((i2 & 4) != 0) {
            str = wheelSegment.text;
        }
        return wheelSegment.m14322copybw27NRU(i, j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: copy-bw27NRU, reason: not valid java name */
    public final WheelSegment m14322copybw27NRU(int value, long color, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new WheelSegment(value, color, text, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WheelSegment)) {
            return false;
        }
        WheelSegment wheelSegment = (WheelSegment) other;
        return this.value == wheelSegment.value && Color.m5169equalsimpl0(this.color, wheelSegment.color) && Intrinsics.areEqual(this.text, wheelSegment.text);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.value) * 31) + Color.m5175hashCodeimpl(this.color)) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "WheelSegment(value=" + this.value + ", color=" + Color.m5176toStringimpl(this.color) + ", text=" + this.text + ")";
    }

    private WheelSegment(int i, long j, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.value = i;
        this.color = j;
        this.text = text;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m14323getColor0d7_KjU() {
        return this.color;
    }

    public final String getText() {
        return this.text;
    }
}
