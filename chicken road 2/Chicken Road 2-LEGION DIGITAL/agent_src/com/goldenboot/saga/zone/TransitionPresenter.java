package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class TransitionPresenter {
    public float[] evictLayout;
    public int growPayload;

    public /* synthetic */ TransitionPresenter(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ String releaseHeader(TransitionPresenter transitionPresenter, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return transitionPresenter.detachStream(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final float clipOrigin() {
        if (this.growPayload == 0) {
            LifecycleCreator.detachStream("FloatList is empty.");
        }
        return this.evictLayout[this.growPayload - 1];
    }

    public final String detachStream(CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.evictLayout;
        int i2 = this.growPayload;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append(postfix);
                break;
            }
            float f = fArr[i3];
            if (i3 == i) {
                sb.append(truncated);
                break;
            }
            if (i3 != 0) {
                sb.append(separator);
            }
            sb.append(f);
            i3++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TransitionPresenter) {
            TransitionPresenter transitionPresenter = (TransitionPresenter) obj;
            int i = transitionPresenter.growPayload;
            int i2 = this.growPayload;
            if (i == i2) {
                float[] fArr = this.evictLayout;
                float[] fArr2 = transitionPresenter.evictLayout;
                WatcherLogger attachConfig = CellEntry.attachConfig(0, i2);
                int applyTask = attachConfig.applyTask();
                int serializeOffset = attachConfig.serializeOffset();
                if (applyTask > serializeOffset) {
                    return true;
                }
                while (fArr[applyTask] == fArr2[applyTask]) {
                    if (applyTask == serializeOffset) {
                        return true;
                    }
                    applyTask++;
                }
                return false;
            }
        }
        return false;
    }

    public final float evictLayout() {
        if (this.growPayload == 0) {
            LifecycleCreator.detachStream("FloatList is empty.");
        }
        return this.evictLayout[0];
    }

    public final float growPayload(int i) {
        if (i < 0 || i >= this.growPayload) {
            LifecycleCreator.injectMetric("Index must be between 0 and size");
        }
        return this.evictLayout[i];
    }

    public int hashCode() {
        float[] fArr = this.evictLayout;
        int i = this.growPayload;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.hashCode(fArr[i3]) * 31;
        }
        return i2;
    }

    public final int injectMetric() {
        return this.growPayload;
    }

    public String toString() {
        return releaseHeader(this, null, "[", "]", 0, null, 25, null);
    }

    public TransitionPresenter(int i) {
        this.evictLayout = i == 0 ? DialogDecoder.evictLayout() : new float[i];
    }
}
