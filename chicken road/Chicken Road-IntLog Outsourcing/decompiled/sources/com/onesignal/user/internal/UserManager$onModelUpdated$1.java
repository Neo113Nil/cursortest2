package com.onesignal.user.internal;

import com.onesignal.user.state.IUserStateObserver;
import com.onesignal.user.state.UserChangedState;
import com.onesignal.user.state.UserState;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class UserManager$onModelUpdated$1 extends j implements InterfaceC1441l {
    final /* synthetic */ UserState $newUserState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserManager$onModelUpdated$1(UserState userState) {
        super(1);
        this.$newUserState = userState;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IUserStateObserver) obj);
        return v.f5689a;
    }

    public final void invoke(IUserStateObserver it) {
        i.e(it, "it");
        it.onUserStateChange(new UserChangedState(this.$newUserState));
    }
}
