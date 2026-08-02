package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public final int a;
    public final float b;
    public Object c;

    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    @RequiresApi(19)
    public static class b {
        @DoNotInline
        public static float a(Rating rating) {
            return rating.getPercentRating();
        }

        @DoNotInline
        public static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        @DoNotInline
        public static float c(Rating rating) {
            return rating.getStarRating();
        }

        @DoNotInline
        public static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        @DoNotInline
        public static boolean e(Rating rating) {
            return rating.isRated();
        }

        @DoNotInline
        public static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        @DoNotInline
        public static Rating g(boolean z) {
            return Rating.newHeartRating(z);
        }

        @DoNotInline
        public static Rating h(float f) {
            return Rating.newPercentageRating(f);
        }

        @DoNotInline
        public static Rating i(int i, float f) {
            return Rating.newStarRating(i, f);
        }

        @DoNotInline
        public static Rating j(boolean z) {
            return Rating.newThumbRating(z);
        }

        @DoNotInline
        public static Rating k(int i) {
            return Rating.newUnratedRating(i);
        }
    }

    public RatingCompat(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
