package com.goldenboot.saga.zone;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class WidgetExporter implements Parcelable {
    public final Intent notifyMessage;
    public final int reduceScope;
    public static final BounceHandler connectPatch = new BounceHandler(null);
    public static final Parcelable.Creator<WidgetExporter> CREATOR = new ActivityMutator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public WidgetExporter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetExporter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: growPayload, reason: merged with bridge method [inline-methods] */
        public WidgetExporter[] newArray(int i) {
            return new WidgetExporter[i];
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
        public /* synthetic */ BounceHandler(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String evictLayout(int i) {
            return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
        }

        public BounceHandler() {
        }
    }

    public WidgetExporter(int i, Intent intent) {
        this.reduceScope = i;
        this.notifyMessage = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent evictLayout() {
        return this.notifyMessage;
    }

    public final int growPayload() {
        return this.reduceScope;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + connectPatch.evictLayout(this.reduceScope) + ", data=" + this.notifyMessage + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.reduceScope);
        dest.writeInt(this.notifyMessage == null ? 0 : 1);
        Intent intent = this.notifyMessage;
        if (intent != null) {
            intent.writeToParcel(dest, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetExporter(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
