package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vk.sdk.api.model.VKApiUserFull;
import org.betup.R;

/* loaded from: classes2.dex */
public final class GameCardViewBinding implements ViewBinding {
    public final Guideline cardFaceHalfGuideline;
    public final View cardMiddleSuite;
    public final View cardTopSuite;
    public final TextView gameCardValue;
    private final View rootView;

    private GameCardViewBinding(View rootView, Guideline cardFaceHalfGuideline, View cardMiddleSuite, View cardTopSuite, TextView gameCardValue) {
        this.rootView = rootView;
        this.cardFaceHalfGuideline = cardFaceHalfGuideline;
        this.cardMiddleSuite = cardMiddleSuite;
        this.cardTopSuite = cardTopSuite;
        this.gameCardValue = gameCardValue;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static GameCardViewBinding inflate(LayoutInflater inflater, ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(VKApiUserFull.RelativeType.PARENT);
        }
        inflater.inflate(R.layout.game_card_view, parent);
        return bind(parent);
    }

    public static GameCardViewBinding bind(View rootView) {
        int i = R.id.cardFaceHalfGuideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.cardFaceHalfGuideline);
        if (guideline != null) {
            i = R.id.cardMiddleSuite;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.cardMiddleSuite);
            if (findChildViewById != null) {
                i = R.id.cardTopSuite;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.cardTopSuite);
                if (findChildViewById2 != null) {
                    i = R.id.gameCardValue;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.gameCardValue);
                    if (textView != null) {
                        return new GameCardViewBinding(rootView, guideline, findChildViewById, findChildViewById2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
