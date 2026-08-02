package org.betup.ui.fragment.matches;

import org.betup.ui.fragment.BaseFragment;

/* loaded from: classes4.dex */
public interface MatchTabProvider {
    int getCount();

    BaseFragment getFragmentForPosition(int position);

    String getTitle(int position);
}
