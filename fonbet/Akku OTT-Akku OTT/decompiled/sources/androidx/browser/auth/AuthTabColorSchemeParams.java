package androidx.browser.auth;

import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class AuthTabColorSchemeParams {

    @ColorInt
    private final Integer mNavigationBarColor;

    @ColorInt
    private final Integer mNavigationBarDividerColor;

    @ColorInt
    private final Integer mToolbarColor;

    public static final class Builder {

        @ColorInt
        private Integer mNavigationBarColor;

        @ColorInt
        private Integer mNavigationBarDividerColor;

        @ColorInt
        private Integer mToolbarColor;

        public AuthTabColorSchemeParams build() {
            return new AuthTabColorSchemeParams(this.mToolbarColor, this.mNavigationBarColor, this.mNavigationBarDividerColor);
        }

        public Builder setNavigationBarColor(@ColorInt int i) {
            this.mNavigationBarColor = Integer.valueOf(i | ViewCompat.MEASURED_STATE_MASK);
            return this;
        }

        public Builder setNavigationBarDividerColor(@ColorInt int i) {
            this.mNavigationBarDividerColor = Integer.valueOf(i);
            return this;
        }

        public Builder setToolbarColor(@ColorInt int i) {
            this.mToolbarColor = Integer.valueOf(i | ViewCompat.MEASURED_STATE_MASK);
            return this;
        }
    }

    public static AuthTabColorSchemeParams fromBundle(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new AuthTabColorSchemeParams((Integer) bundle.get(CustomTabsIntent.EXTRA_TOOLBAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR));
    }

    @ColorInt
    public Integer getNavigationBarColor() {
        return this.mNavigationBarColor;
    }

    @ColorInt
    public Integer getNavigationBarDividerColor() {
        return this.mNavigationBarDividerColor;
    }

    @ColorInt
    public Integer getToolbarColor() {
        return this.mToolbarColor;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        Integer num = this.mToolbarColor;
        if (num != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_TOOLBAR_COLOR, num.intValue());
        }
        Integer num2 = this.mNavigationBarColor;
        if (num2 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR, num2.intValue());
        }
        Integer num3 = this.mNavigationBarDividerColor;
        if (num3 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR, num3.intValue());
        }
        return bundle;
    }

    public AuthTabColorSchemeParams withDefaults(AuthTabColorSchemeParams authTabColorSchemeParams) {
        Integer num = this.mToolbarColor;
        if (num == null) {
            num = authTabColorSchemeParams.mToolbarColor;
        }
        Integer num2 = this.mNavigationBarColor;
        if (num2 == null) {
            num2 = authTabColorSchemeParams.mNavigationBarColor;
        }
        Integer num3 = this.mNavigationBarDividerColor;
        if (num3 == null) {
            num3 = authTabColorSchemeParams.mNavigationBarDividerColor;
        }
        return new AuthTabColorSchemeParams(num, num2, num3);
    }

    private AuthTabColorSchemeParams(@ColorInt Integer num, @ColorInt Integer num2, @ColorInt Integer num3) {
        this.mToolbarColor = num;
        this.mNavigationBarColor = num2;
        this.mNavigationBarDividerColor = num3;
    }
}
