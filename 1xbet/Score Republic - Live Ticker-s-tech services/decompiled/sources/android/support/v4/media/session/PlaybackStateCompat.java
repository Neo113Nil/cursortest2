package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.C0936z2;
import p000.hn0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0936z2(16);

    /* JADX INFO: renamed from: j */
    public final int f280j;

    /* JADX INFO: renamed from: k */
    public final long f281k;

    /* JADX INFO: renamed from: l */
    public final long f282l;

    /* JADX INFO: renamed from: m */
    public final float f283m;

    /* JADX INFO: renamed from: n */
    public final long f284n;

    /* JADX INFO: renamed from: o */
    public final int f285o;

    /* JADX INFO: renamed from: p */
    public final CharSequence f286p;

    /* JADX INFO: renamed from: q */
    public final long f287q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f288r;

    /* JADX INFO: renamed from: s */
    public final long f289s;

    /* JADX INFO: renamed from: t */
    public final Bundle f290t;

    /* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0026a();

        /* JADX INFO: renamed from: j */
        public final String f291j;

        /* JADX INFO: renamed from: k */
        public final CharSequence f292k;

        /* JADX INFO: renamed from: l */
        public final int f293l;

        /* JADX INFO: renamed from: m */
        public final Bundle f294m;

        public CustomAction(Parcel parcel) {
            this.f291j = parcel.readString();
            this.f292k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f293l = parcel.readInt();
            this.f294m = parcel.readBundle(hn0.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f292k) + ", mIcon=" + this.f293l + ", mExtras=" + this.f294m;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f291j);
            TextUtils.writeToParcel(this.f292k, parcel, i);
            parcel.writeInt(this.f293l);
            parcel.writeBundle(this.f294m);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f280j = parcel.readInt();
        this.f281k = parcel.readLong();
        this.f283m = parcel.readFloat();
        this.f287q = parcel.readLong();
        this.f282l = parcel.readLong();
        this.f284n = parcel.readLong();
        this.f286p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f288r = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f289s = parcel.readLong();
        this.f290t = parcel.readBundle(hn0.class.getClassLoader());
        this.f285o = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f280j + ", position=" + this.f281k + ", buffered position=" + this.f282l + ", speed=" + this.f283m + ", updated=" + this.f287q + ", actions=" + this.f284n + ", error code=" + this.f285o + ", error message=" + this.f286p + ", custom actions=" + this.f288r + ", active item id=" + this.f289s + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f280j);
        parcel.writeLong(this.f281k);
        parcel.writeFloat(this.f283m);
        parcel.writeLong(this.f287q);
        parcel.writeLong(this.f282l);
        parcel.writeLong(this.f284n);
        TextUtils.writeToParcel(this.f286p, parcel, i);
        parcel.writeTypedList(this.f288r);
        parcel.writeLong(this.f289s);
        parcel.writeBundle(this.f290t);
        parcel.writeInt(this.f285o);
    }
}
