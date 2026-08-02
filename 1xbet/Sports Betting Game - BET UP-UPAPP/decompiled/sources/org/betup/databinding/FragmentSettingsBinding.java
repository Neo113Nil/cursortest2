package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentSettingsBinding implements ViewBinding {
    public final RelativeLayout balanceHistory;
    public final CheckBox betPush;
    public final RelativeLayout changeCountry;
    public final RelativeLayout changeLanguage;
    public final RelativeLayout changeName;
    public final RelativeLayout changeProfilePhoto;
    public final RelativeLayout deleteAccountSettingsFragment;
    public final RelativeLayout enterInviteCode;
    public final RelativeLayout logoutSettingsFragment;
    public final CheckBox matchPush;
    public final RelativeLayout myFavoriteLeagues;
    public final RelativeLayout myFavoriteSports;
    public final RelativeLayout myFavoriteTeams;
    public final RelativeLayout myOddsFormat;
    public final RelativeLayout notificationForMatchesSettingsFragment;
    private final LinearLayout rootView;
    public final ImageView textView43;
    public final ImageView textView99;
    public final RelativeLayout visualEffects;

    private FragmentSettingsBinding(LinearLayout rootView, RelativeLayout balanceHistory, CheckBox betPush, RelativeLayout changeCountry, RelativeLayout changeLanguage, RelativeLayout changeName, RelativeLayout changeProfilePhoto, RelativeLayout deleteAccountSettingsFragment, RelativeLayout enterInviteCode, RelativeLayout logoutSettingsFragment, CheckBox matchPush, RelativeLayout myFavoriteLeagues, RelativeLayout myFavoriteSports, RelativeLayout myFavoriteTeams, RelativeLayout myOddsFormat, RelativeLayout notificationForMatchesSettingsFragment, ImageView textView43, ImageView textView99, RelativeLayout visualEffects) {
        this.rootView = rootView;
        this.balanceHistory = balanceHistory;
        this.betPush = betPush;
        this.changeCountry = changeCountry;
        this.changeLanguage = changeLanguage;
        this.changeName = changeName;
        this.changeProfilePhoto = changeProfilePhoto;
        this.deleteAccountSettingsFragment = deleteAccountSettingsFragment;
        this.enterInviteCode = enterInviteCode;
        this.logoutSettingsFragment = logoutSettingsFragment;
        this.matchPush = matchPush;
        this.myFavoriteLeagues = myFavoriteLeagues;
        this.myFavoriteSports = myFavoriteSports;
        this.myFavoriteTeams = myFavoriteTeams;
        this.myOddsFormat = myOddsFormat;
        this.notificationForMatchesSettingsFragment = notificationForMatchesSettingsFragment;
        this.textView43 = textView43;
        this.textView99 = textView99;
        this.visualEffects = visualEffects;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSettingsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentSettingsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_settings, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSettingsBinding bind(View rootView) {
        int i = R.id.balanceHistory;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.balanceHistory);
        if (relativeLayout != null) {
            i = R.id.betPush;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.betPush);
            if (checkBox != null) {
                i = R.id.changeCountry;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.changeCountry);
                if (relativeLayout2 != null) {
                    i = R.id.changeLanguage;
                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.changeLanguage);
                    if (relativeLayout3 != null) {
                        i = R.id.changeName;
                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.changeName);
                        if (relativeLayout4 != null) {
                            i = R.id.changeProfilePhoto;
                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.changeProfilePhoto);
                            if (relativeLayout5 != null) {
                                i = R.id.deleteAccountSettingsFragment;
                                RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.deleteAccountSettingsFragment);
                                if (relativeLayout6 != null) {
                                    i = R.id.enterInviteCode;
                                    RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.enterInviteCode);
                                    if (relativeLayout7 != null) {
                                        i = R.id.logoutSettingsFragment;
                                        RelativeLayout relativeLayout8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.logoutSettingsFragment);
                                        if (relativeLayout8 != null) {
                                            i = R.id.matchPush;
                                            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.matchPush);
                                            if (checkBox2 != null) {
                                                i = R.id.myFavoriteLeagues;
                                                RelativeLayout relativeLayout9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.myFavoriteLeagues);
                                                if (relativeLayout9 != null) {
                                                    i = R.id.myFavoriteSports;
                                                    RelativeLayout relativeLayout10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.myFavoriteSports);
                                                    if (relativeLayout10 != null) {
                                                        i = R.id.myFavoriteTeams;
                                                        RelativeLayout relativeLayout11 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.myFavoriteTeams);
                                                        if (relativeLayout11 != null) {
                                                            i = R.id.myOddsFormat;
                                                            RelativeLayout relativeLayout12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.myOddsFormat);
                                                            if (relativeLayout12 != null) {
                                                                i = R.id.notificationForMatchesSettingsFragment;
                                                                RelativeLayout relativeLayout13 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.notificationForMatchesSettingsFragment);
                                                                if (relativeLayout13 != null) {
                                                                    i = R.id.textView43;
                                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.textView43);
                                                                    if (imageView != null) {
                                                                        i = R.id.textView99;
                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.textView99);
                                                                        if (imageView2 != null) {
                                                                            i = R.id.visualEffects;
                                                                            RelativeLayout relativeLayout14 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.visualEffects);
                                                                            if (relativeLayout14 != null) {
                                                                                return new FragmentSettingsBinding((LinearLayout) rootView, relativeLayout, checkBox, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, relativeLayout8, checkBox2, relativeLayout9, relativeLayout10, relativeLayout11, relativeLayout12, relativeLayout13, imageView, imageView2, relativeLayout14);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
