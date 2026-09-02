package com.goldenboot.saga.zone;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class SaveMigration implements Cloneable {
    public /* synthetic */ int attachConfig;
    public /* synthetic */ Object[] connectPatch;
    public /* synthetic */ int[] notifyMessage;
    public /* synthetic */ boolean reduceScope;

    public SaveMigration() {
        this(0, 1, null);
    }

    public int applyTask(int i) {
        if (this.reduceScope) {
            ThemePropagator.detachStream(this);
        }
        return this.notifyMessage[i];
    }

    public Object clipOrigin(int i) {
        return ThemePropagator.injectMetric(this, i);
    }

    public Object connectJob(int i, Object obj) {
        int flushSample = flushSample(i);
        if (flushSample < 0) {
            return null;
        }
        Object[] objArr = this.connectPatch;
        Object obj2 = objArr[flushSample];
        objArr[flushSample] = obj;
        return obj2;
    }

    public boolean detachStream(int i) {
        return flushSample(i) >= 0;
    }

    public void drawField(int i) {
        Object obj;
        Object obj2;
        Object obj3 = this.connectPatch[i];
        obj = ThemePropagator.evictLayout;
        if (obj3 != obj) {
            Object[] objArr = this.connectPatch;
            obj2 = ThemePropagator.evictLayout;
            objArr[i] = obj2;
            this.reduceScope = true;
        }
    }

    public void evictLayout(int i, Object obj) {
        int i2 = this.attachConfig;
        if (i2 != 0 && i <= this.notifyMessage[i2 - 1]) {
            popBlueprint(i, obj);
            return;
        }
        if (this.reduceScope && i2 >= this.notifyMessage.length) {
            ThemePropagator.detachStream(this);
        }
        int i3 = this.attachConfig;
        if (i3 >= this.notifyMessage.length) {
            int releaseHeader = IndicatorProvider.releaseHeader(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.notifyMessage, releaseHeader);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.notifyMessage = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.connectPatch, releaseHeader);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.connectPatch = copyOf2;
        }
        this.notifyMessage[i3] = i;
        this.connectPatch[i3] = obj;
        this.attachConfig = i3 + 1;
    }

    public int flushSample(int i) {
        if (this.reduceScope) {
            ThemePropagator.detachStream(this);
        }
        return IndicatorProvider.evictLayout(this.notifyMessage, this.attachConfig, i);
    }

    public void growPayload() {
        int i = this.attachConfig;
        Object[] objArr = this.connectPatch;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.attachConfig = 0;
        this.reduceScope = false;
    }

    /* renamed from: injectMetric, reason: merged with bridge method [inline-methods] */
    public SaveMigration clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SaveMigration saveMigration = (SaveMigration) clone;
        saveMigration.notifyMessage = (int[]) this.notifyMessage.clone();
        saveMigration.connectPatch = (Object[]) this.connectPatch.clone();
        return saveMigration;
    }

    public int peekRevision() {
        if (this.reduceScope) {
            ThemePropagator.detachStream(this);
        }
        return this.attachConfig;
    }

    public void popBlueprint(int i, Object obj) {
        Object obj2;
        int evictLayout = IndicatorProvider.evictLayout(this.notifyMessage, this.attachConfig, i);
        if (evictLayout >= 0) {
            this.connectPatch[evictLayout] = obj;
            return;
        }
        int i2 = ~evictLayout;
        if (i2 < this.attachConfig) {
            Object obj3 = this.connectPatch[i2];
            obj2 = ThemePropagator.evictLayout;
            if (obj3 == obj2) {
                this.notifyMessage[i2] = i;
                this.connectPatch[i2] = obj;
                return;
            }
        }
        if (this.reduceScope && this.attachConfig >= this.notifyMessage.length) {
            ThemePropagator.detachStream(this);
            i2 = ~IndicatorProvider.evictLayout(this.notifyMessage, this.attachConfig, i);
        }
        int i3 = this.attachConfig;
        if (i3 >= this.notifyMessage.length) {
            int releaseHeader = IndicatorProvider.releaseHeader(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.notifyMessage, releaseHeader);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.notifyMessage = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.connectPatch, releaseHeader);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.connectPatch = copyOf2;
        }
        int i4 = this.attachConfig;
        if (i4 - i2 != 0) {
            int[] iArr = this.notifyMessage;
            int i5 = i2 + 1;
            InsetsReader.updateTimer(iArr, iArr, i5, i2, i4);
            Object[] objArr = this.connectPatch;
            InsetsReader.popBlueprint(objArr, objArr, i5, i2, this.attachConfig);
        }
        this.notifyMessage[i2] = i;
        this.connectPatch[i2] = obj;
        this.attachConfig++;
    }

    public Object serializeOffset(int i) {
        if (this.reduceScope) {
            ThemePropagator.detachStream(this);
        }
        Object[] objArr = this.connectPatch;
        if (i < objArr.length) {
            return objArr[i];
        }
        WrapperLink wrapperLink = WrapperLink.evictLayout;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (peekRevision() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.attachConfig * 28);
        sb.append('{');
        int i = this.attachConfig;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(applyTask(i2));
            sb.append('=');
            Object serializeOffset = serializeOffset(i2);
            if (serializeOffset != this) {
                sb.append(serializeOffset);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public int updateTimer(Object obj) {
        if (this.reduceScope) {
            ThemePropagator.detachStream(this);
        }
        int i = this.attachConfig;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.connectPatch[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    public SaveMigration(int i) {
        if (i == 0) {
            this.notifyMessage = IndicatorProvider.evictLayout;
            this.connectPatch = IndicatorProvider.injectMetric;
        } else {
            int releaseHeader = IndicatorProvider.releaseHeader(i);
            this.notifyMessage = new int[releaseHeader];
            this.connectPatch = new Object[releaseHeader];
        }
    }

    public /* synthetic */ SaveMigration(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
