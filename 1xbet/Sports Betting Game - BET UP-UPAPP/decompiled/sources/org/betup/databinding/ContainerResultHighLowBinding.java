package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class ContainerResultHighLowBinding implements ViewBinding {
    public final AlphaPressButton okButton;
    public final ContainerResultGamesBinding resultContainer;
    private final ConstraintLayout rootView;
    public final ConstraintLayout wonMoneyAmountContainer;

    private ContainerResultHighLowBinding(ConstraintLayout rootView, AlphaPressButton okButton, ContainerResultGamesBinding resultContainer, ConstraintLayout wonMoneyAmountContainer) {
        this.rootView = rootView;
        this.okButton = okButton;
        this.resultContainer = resultContainer;
        this.wonMoneyAmountContainer = wonMoneyAmountContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ContainerResultHighLowBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ContainerResultHighLowBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.container_result_high_low, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ContainerResultHighLowBinding bind(View rootView) {
        int i = R.id.okButton;
        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.okButton);
        if (alphaPressButton != null) {
            i = R.id.result_container;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.result_container);
            if (findChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                return new ContainerResultHighLowBinding(constraintLayout, alphaPressButton, ContainerResultGamesBinding.bind(findChildViewById), constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
