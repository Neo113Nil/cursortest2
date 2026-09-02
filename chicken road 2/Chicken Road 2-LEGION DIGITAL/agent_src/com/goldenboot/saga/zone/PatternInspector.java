package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/goldenboot/saga/zone/PatternInspector;", "", "", "mask", "<init>", "(I)V", "decoration", "clipOrigin", "(Lcom/goldenboot/saga/zone/PatternInspector;)Lcom/goldenboot/saga/zone/PatternInspector;", "other", "", "detachStream", "(Lcom/goldenboot/saga/zone/PatternInspector;)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "evictLayout", "I", "releaseHeader", "growPayload", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PatternInspector {
    public static final int injectMetric = 0;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final int mask;

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PatternInspector detachStream = new PatternInspector(0);
    private static final PatternInspector releaseHeader = new PatternInspector(1);
    private static final PatternInspector clipOrigin = new PatternInspector(2);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/goldenboot/saga/zone/PatternInspector$ActivityMutator;", "", "<init>", "()V", "", "Lcom/goldenboot/saga/zone/PatternInspector;", "decorations", "evictLayout", "(Ljava/util/List;)Lcom/goldenboot/saga/zone/PatternInspector;", "None", "Lcom/goldenboot/saga/zone/PatternInspector;", "detachStream", "()Lcom/goldenboot/saga/zone/PatternInspector;", "releaseHeader", "Underline", "clipOrigin", "flushSample", "LineThrough", "growPayload", "injectMetric", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.PatternInspector$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PatternInspector clipOrigin() {
            return PatternInspector.releaseHeader;
        }

        public final PatternInspector detachStream() {
            return PatternInspector.detachStream;
        }

        public final PatternInspector evictLayout(List<PatternInspector> decorations) {
            Integer num = 0;
            int size = decorations.size();
            for (int i = 0; i < size; i++) {
                num = Integer.valueOf(num.intValue() | decorations.get(i).releaseHeader());
            }
            return new PatternInspector(num.intValue());
        }

        public final PatternInspector growPayload() {
            return PatternInspector.clipOrigin;
        }

        private Companion() {
        }

        public static /* synthetic */ void flushSample() {
        }

        public static /* synthetic */ void injectMetric() {
        }

        public static /* synthetic */ void releaseHeader() {
        }
    }

    public PatternInspector(int i) {
        this.mask = i;
    }

    public final PatternInspector clipOrigin(PatternInspector decoration) {
        return new PatternInspector(this.mask | decoration.mask);
    }

    public final boolean detachStream(PatternInspector other) {
        int i = this.mask;
        return (other.mask | i) == i;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PatternInspector) && this.mask == ((PatternInspector) other).mask;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getMask() {
        return this.mask;
    }

    public final int releaseHeader() {
        return this.mask;
    }

    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & releaseHeader.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & clipOrigin.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + WatcherRevision.attachConfig(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
