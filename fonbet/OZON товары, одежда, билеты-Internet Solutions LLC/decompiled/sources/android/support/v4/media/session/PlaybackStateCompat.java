package android.support.v4.media.session;

import P4.f;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes8.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f36897a;

    /* renamed from: b, reason: collision with root package name */
    final long f36898b;

    /* renamed from: c, reason: collision with root package name */
    final long f36899c;

    /* renamed from: d, reason: collision with root package name */
    final float f36900d;

    /* renamed from: e, reason: collision with root package name */
    final long f36901e;

    /* renamed from: f, reason: collision with root package name */
    final int f36902f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f36903g;

    /* renamed from: h, reason: collision with root package name */
    final long f36904h;

    /* renamed from: i, reason: collision with root package name */
    ArrayList f36905i;

    /* renamed from: j, reason: collision with root package name */
    final long f36906j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f36907k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f36908a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f36909b;

        /* renamed from: c, reason: collision with root package name */
        private final int f36910c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f36911d;

        final class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i11) {
                return new CustomAction[i11];
            }
        }

        CustomAction(Parcel parcel) {
            this.f36908a = parcel.readString();
            this.f36909b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f36910c = parcel.readInt();
            this.f36911d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f36909b) + ", mIcon=" + this.f36910c + ", mExtras=" + this.f36911d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f36908a);
            TextUtils.writeToParcel(this.f36909b, parcel, i11);
            parcel.writeInt(this.f36910c);
            parcel.writeBundle(this.f36911d);
        }
    }

    final class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i11) {
            return new PlaybackStateCompat[i11];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f36897a = parcel.readInt();
        this.f36898b = parcel.readLong();
        this.f36900d = parcel.readFloat();
        this.f36904h = parcel.readLong();
        this.f36899c = parcel.readLong();
        this.f36901e = parcel.readLong();
        this.f36903g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f36905i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f36906j = parcel.readLong();
        this.f36907k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f36902f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f36897a);
        sb2.append(", position=");
        sb2.append(this.f36898b);
        sb2.append(", buffered position=");
        sb2.append(this.f36899c);
        sb2.append(", speed=");
        sb2.append(this.f36900d);
        sb2.append(", updated=");
        sb2.append(this.f36904h);
        sb2.append(", actions=");
        sb2.append(this.f36901e);
        sb2.append(", error code=");
        sb2.append(this.f36902f);
        sb2.append(", error message=");
        sb2.append(this.f36903g);
        sb2.append(", custom actions=");
        sb2.append(this.f36905i);
        sb2.append(", active item id=");
        return f.a(this.f36906j, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f36897a);
        parcel.writeLong(this.f36898b);
        parcel.writeFloat(this.f36900d);
        parcel.writeLong(this.f36904h);
        parcel.writeLong(this.f36899c);
        parcel.writeLong(this.f36901e);
        TextUtils.writeToParcel(this.f36903g, parcel, i11);
        parcel.writeTypedList(this.f36905i);
        parcel.writeLong(this.f36906j);
        parcel.writeBundle(this.f36907k);
        parcel.writeInt(this.f36902f);
    }
}
