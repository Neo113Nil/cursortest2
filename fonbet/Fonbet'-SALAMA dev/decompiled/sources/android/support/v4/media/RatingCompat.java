package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Z2.a(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f7994a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7995b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7996c;

    public RatingCompat(int i7, float f7) {
        this.f7994a = i7;
        this.f7995b = f7;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b7 = h.b(rating);
            if (!h.e(rating)) {
                switch (b7) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(b7, -1.0f);
                        break;
                }
            } else {
                switch (b7) {
                    case 1:
                        ratingCompat = new RatingCompat(1, h.d(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, h.f(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat2 = d(h.c(rating), b7);
                        break;
                    case 6:
                        ratingCompat2 = c(h.a(rating));
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.f7996c = obj;
        }
        return ratingCompat2;
    }

    public static RatingCompat c(float f7) {
        if (f7 >= 0.0f && f7 <= 100.0f) {
            return new RatingCompat(6, f7);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat d(float f7, int i7) {
        float f8;
        if (i7 == 3) {
            f8 = 3.0f;
        } else if (i7 == 4) {
            f8 = 4.0f;
        } else {
            if (i7 != 5) {
                Log.e("Rating", "Invalid rating style (" + i7 + ") for a star rating");
                return null;
            }
            f8 = 5.0f;
        }
        if (f7 >= 0.0f && f7 <= f8) {
            return new RatingCompat(i7, f7);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final boolean b() {
        return this.f7995b >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f7994a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f7994a);
        sb.append(" rating=");
        float f7 = this.f7995b;
        sb.append(f7 < 0.0f ? "unrated" : String.valueOf(f7));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f7994a);
        parcel.writeFloat(this.f7995b);
    }
}
