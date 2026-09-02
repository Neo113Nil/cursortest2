package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/goldenboot/saga/zone/AccentCollector;", "Lcom/goldenboot/saga/zone/DividerSegment;", "", "", "words", "<init>", "(I)V", "()V", "detachStream", "(I)Ljava/lang/String;", "evictLayout", "I", "Lcom/goldenboot/saga/zone/CompatCache;", "growPayload", "()Lcom/goldenboot/saga/zone/CompatCache;", "values", "ui-tooling-preview"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class AccentCollector implements DividerSegment<String> {
    public static final int growPayload = 0;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final int words;

    public AccentCollector(int i) {
        this.words = i;
    }

    private final String detachStream(int words) {
        List list;
        final Ref.IntRef intRef = new Ref.IntRef();
        list = BorderParser.evictLayout;
        final int size = list.size();
        return BadgeResolver.purgeNode(BadgeResolver.decodePath(PaddingStage.updateTimer(new ElevationNode() { // from class: com.goldenboot.saga.zone.ApplicationEvent
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                String releaseHeader;
                releaseHeader = AccentCollector.releaseHeader(Ref.IntRef.this, size);
                return releaseHeader;
            }
        }), words), " ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String releaseHeader(Ref.IntRef intRef, int i) {
        List list;
        list = BorderParser.evictLayout;
        int i2 = intRef.element;
        intRef.element = i2 + 1;
        return (String) list.get(i2 % i);
    }

    @Override // com.goldenboot.saga.zone.DividerSegment
    public CompatCache growPayload() {
        return PaddingStage.connectJob(detachStream(this.words));
    }

    public AccentCollector() {
        this(500);
    }
}
