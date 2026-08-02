package io.sentry.android.replay.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import t6.e;
import t6.h;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class TextAttributes {
    public static final int $stable = 0;
    private final Color color;
    private final boolean hasFillModifier;

    public /* synthetic */ TextAttributes(Color color, boolean z4, e eVar) {
        this(color, z4);
    }

    /* renamed from: copy-fRWUv9g$default, reason: not valid java name */
    public static /* synthetic */ TextAttributes m22copyfRWUv9g$default(TextAttributes textAttributes, Color color, boolean z4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            color = textAttributes.color;
        }
        if ((i7 & 2) != 0) {
            z4 = textAttributes.hasFillModifier;
        }
        return textAttributes.m24copyfRWUv9g(color, z4);
    }

    /* renamed from: component1-QN2ZGVo, reason: not valid java name */
    public final Color m23component1QN2ZGVo() {
        return this.color;
    }

    public final boolean component2() {
        return this.hasFillModifier;
    }

    /* renamed from: copy-fRWUv9g, reason: not valid java name */
    public final TextAttributes m24copyfRWUv9g(Color color, boolean z4) {
        return new TextAttributes(color, z4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAttributes)) {
            return false;
        }
        TextAttributes textAttributes = (TextAttributes) obj;
        return h.a(this.color, textAttributes.color) && this.hasFillModifier == textAttributes.hasFillModifier;
    }

    /* renamed from: getColor-QN2ZGVo, reason: not valid java name */
    public final Color m25getColorQN2ZGVo() {
        return this.color;
    }

    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    public int hashCode() {
        Color color = this.color;
        return Boolean.hashCode(this.hasFillModifier) + ((color == null ? 0 : Color.hashCode-impl(color.unbox-impl())) * 31);
    }

    public String toString() {
        return "TextAttributes(color=" + this.color + ", hasFillModifier=" + this.hasFillModifier + ')';
    }

    private TextAttributes(Color color, boolean z4) {
        this.color = color;
        this.hasFillModifier = z4;
    }
}
