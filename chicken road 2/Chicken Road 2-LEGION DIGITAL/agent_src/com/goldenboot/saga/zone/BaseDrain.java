package com.goldenboot.saga.zone;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class BaseDrain implements FeedbackExecutor {
    public final Object detachStream;
    public final String evictLayout;
    public final TouchRecord growPayload;
    public final ProgressValve injectMetric;
    public volatile LongPressDispatcher releaseHeader;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public final /* synthetic */ BaseDrain notifyMessage;
        public final /* synthetic */ Context reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(Context context, BaseDrain baseDrain) {
            super(0);
            this.reduceScope = context;
            this.notifyMessage = baseDrain;
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.reduceScope;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return ApplicationShaper.evictLayout(applicationContext, this.notifyMessage.evictLayout);
        }
    }

    public BaseDrain(String name, SnackbarTree snackbarTree, TouchRecord produceMigrations, ProgressValve scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.evictLayout = name;
        this.growPayload = produceMigrations;
        this.injectMetric = scope;
        this.detachStream = new Object();
    }

    @Override // com.goldenboot.saga.zone.FeedbackExecutor
    /* renamed from: injectMetric, reason: merged with bridge method [inline-methods] */
    public LongPressDispatcher evictLayout(Context thisRef, SetupTrigger property) {
        LongPressDispatcher longPressDispatcher;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        LongPressDispatcher longPressDispatcher2 = this.releaseHeader;
        if (longPressDispatcher2 != null) {
            return longPressDispatcher2;
        }
        synchronized (this.detachStream) {
            try {
                if (this.releaseHeader == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    CardFilter cardFilter = CardFilter.evictLayout;
                    TouchRecord touchRecord = this.growPayload;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.releaseHeader = cardFilter.evictLayout(null, (List) touchRecord.invoke(applicationContext), this.injectMetric, new ActivityMutator(applicationContext, this));
                }
                longPressDispatcher = this.releaseHeader;
                Intrinsics.checkNotNull(longPressDispatcher);
            } catch (Throwable th) {
                throw th;
            }
        }
        return longPressDispatcher;
    }
}
