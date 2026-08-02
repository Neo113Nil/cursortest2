package android.support.v4.media.session;

import W5.AbstractC0486a1;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new s(4);

    /* renamed from: A, reason: collision with root package name */
    public final long f8024A;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f8025B;

    /* renamed from: C, reason: collision with root package name */
    public PlaybackState f8026C;

    /* renamed from: a, reason: collision with root package name */
    public final int f8027a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8028b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8029c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8030d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8031e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8032f;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f8033x;

    /* renamed from: y, reason: collision with root package name */
    public final long f8034y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f8035z;

    public PlaybackStateCompat(int i7, long j, long j3, float f7, long j7, int i8, CharSequence charSequence, long j8, ArrayList arrayList, long j9, Bundle bundle) {
        this.f8027a = i7;
        this.f8028b = j;
        this.f8029c = j3;
        this.f8030d = f7;
        this.f8031e = j7;
        this.f8032f = i8;
        this.f8033x = charSequence;
        this.f8034y = j8;
        this.f8035z = new ArrayList(arrayList);
        this.f8024A = j9;
        this.f8025B = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f8027a);
        sb.append(", position=");
        sb.append(this.f8028b);
        sb.append(", buffered position=");
        sb.append(this.f8029c);
        sb.append(", speed=");
        sb.append(this.f8030d);
        sb.append(", updated=");
        sb.append(this.f8034y);
        sb.append(", actions=");
        sb.append(this.f8031e);
        sb.append(", error code=");
        sb.append(this.f8032f);
        sb.append(", error message=");
        sb.append(this.f8033x);
        sb.append(", custom actions=");
        sb.append(this.f8035z);
        sb.append(", active item id=");
        return AbstractC0486a1.i(sb, this.f8024A, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8027a);
        parcel.writeLong(this.f8028b);
        parcel.writeFloat(this.f8030d);
        parcel.writeLong(this.f8034y);
        parcel.writeLong(this.f8029c);
        parcel.writeLong(this.f8031e);
        TextUtils.writeToParcel(this.f8033x, parcel, i7);
        parcel.writeTypedList(this.f8035z);
        parcel.writeLong(this.f8024A);
        parcel.writeBundle(this.f8025B);
        parcel.writeInt(this.f8032f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new w();

        /* renamed from: a, reason: collision with root package name */
        public final String f8036a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f8037b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8038c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f8039d;

        /* renamed from: e, reason: collision with root package name */
        public PlaybackState.CustomAction f8040e;

        public CustomAction(String str, CharSequence charSequence, int i7, Bundle bundle) {
            this.f8036a = str;
            this.f8037b = charSequence;
            this.f8038c = i7;
            this.f8039d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f8037b) + ", mIcon=" + this.f8038c + ", mExtras=" + this.f8039d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f8036a);
            TextUtils.writeToParcel(this.f8037b, parcel, i7);
            parcel.writeInt(this.f8038c);
            parcel.writeBundle(this.f8039d);
        }

        public CustomAction(Parcel parcel) {
            this.f8036a = parcel.readString();
            this.f8037b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8038c = parcel.readInt();
            this.f8039d = parcel.readBundle(t.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f8027a = parcel.readInt();
        this.f8028b = parcel.readLong();
        this.f8030d = parcel.readFloat();
        this.f8034y = parcel.readLong();
        this.f8029c = parcel.readLong();
        this.f8031e = parcel.readLong();
        this.f8033x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8035z = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f8024A = parcel.readLong();
        this.f8025B = parcel.readBundle(t.class.getClassLoader());
        this.f8032f = parcel.readInt();
    }
}
