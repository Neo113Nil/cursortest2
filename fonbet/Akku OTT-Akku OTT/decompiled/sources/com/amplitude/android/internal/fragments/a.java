package com.amplitude.android.internal.fragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.amplitude.android.utilities.i;
import com.amplitude.android.utilities.j;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends FragmentManager.FragmentLifecycleCallbacks {
    public final j a;
    public final com.amplitude.common.a b;

    public a(j track, com.amplitude.common.a logger) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = track;
        this.b = logger;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(FragmentManager fm, Fragment f) {
        Object m1716constructorimpl;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        super.onFragmentResumed(fm, f);
        String canonicalName = f.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = f.getClass().getSimpleName();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m1716constructorimpl = Result.m1716constructorimpl(f.getResources().getResourceEntryName(f.getId()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m1716constructorimpl = Result.m1716constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(m1716constructorimpl);
        if (m1719exceptionOrNullimpl != null) {
            this.b.b("Failed to get resource entry name: " + m1719exceptionOrNullimpl);
        }
        String str = null;
        if (Result.m1722isFailureimpl(m1716constructorimpl)) {
            m1716constructorimpl = null;
        }
        String str2 = (String) m1716constructorimpl;
        FragmentActivity activity = f.getActivity();
        if (activity != null) {
            i.Companion.getClass();
            str = i.a.a(activity);
        }
        this.a.invoke("[Amplitude] Fragment Viewed", MapsKt.mapOf(TuplesKt.to("[Amplitude] Fragment Class", canonicalName), TuplesKt.to("[Amplitude] Fragment Identifier", str2), TuplesKt.to("[Amplitude] Screen Name", str), TuplesKt.to("[Amplitude] Fragment Tag", f.getTag())));
    }
}
