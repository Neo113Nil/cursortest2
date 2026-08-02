package android.support.v4.media;

import android.media.Rating;

/* loaded from: classes.dex */
public abstract class h {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating g(boolean z4) {
        return Rating.newHeartRating(z4);
    }

    public static Rating h(float f7) {
        return Rating.newPercentageRating(f7);
    }

    public static Rating i(int i7, float f7) {
        return Rating.newStarRating(i7, f7);
    }

    public static Rating j(boolean z4) {
        return Rating.newThumbRating(z4);
    }

    public static Rating k(int i7) {
        return Rating.newUnratedRating(i7);
    }
}
