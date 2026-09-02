package com.goldenboot.saga.zone;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class WaveController implements Parcelable {
    public final int attachConfig;
    public final int connectPatch;
    public final Intent notifyMessage;
    public final IntentSender reduceScope;
    public static final FeedbackFlow resetDelta = new FeedbackFlow(null);
    public static final Parcelable.Creator<WaveController> CREATOR = new BounceHandler();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public int detachStream;
        public final IntentSender evictLayout;
        public Intent growPayload;
        public int injectMetric;

        public ActivityMutator(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.evictLayout = intentSender;
        }

        public final WaveController evictLayout() {
            return new WaveController(this.evictLayout, this.growPayload, this.injectMetric, this.detachStream);
        }

        public final ActivityMutator growPayload(Intent intent) {
            this.growPayload = intent;
            return this;
        }

        public final ActivityMutator injectMetric(int i, int i2) {
            this.detachStream = i;
            this.injectMetric = i2;
            return this;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public WaveController createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new WaveController(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: growPayload, reason: merged with bridge method [inline-methods] */
        public WaveController[] newArray(int i) {
            return new WaveController[i];
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow {
        public /* synthetic */ FeedbackFlow(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public FeedbackFlow() {
        }
    }

    public WaveController(IntentSender intentSender, Intent intent, int i, int i2) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.reduceScope = intentSender;
        this.notifyMessage = intent;
        this.connectPatch = i;
        this.attachConfig = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final IntentSender detachStream() {
        return this.reduceScope;
    }

    public final Intent evictLayout() {
        return this.notifyMessage;
    }

    public final int growPayload() {
        return this.connectPatch;
    }

    public final int injectMetric() {
        return this.attachConfig;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.reduceScope, i);
        dest.writeParcelable(this.notifyMessage, i);
        dest.writeInt(this.connectPatch);
        dest.writeInt(this.attachConfig);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WaveController(Parcel parcel) {
        this((IntentSender) r0, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(readParcelable);
    }
}
