package org.betup.ui.dialogs;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.user.ChangeV7NameInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChangeDisplayNameInteractorAccessor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/betup/ui/dialogs/ChangeDisplayNameInteractorAccessor;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "changeV7NameInteractor", "Lorg/betup/model/remote/api/rest/user/ChangeV7NameInteractor;", "getChangeV7NameInteractor", "()Lorg/betup/model/remote/api/rest/user/ChangeV7NameInteractor;", "setChangeV7NameInteractor", "(Lorg/betup/model/remote/api/rest/user/ChangeV7NameInteractor;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChangeDisplayNameInteractorAccessor {
    public static final int $stable = 8;

    @Inject
    public ChangeV7NameInteractor changeV7NameInteractor;

    public final ChangeV7NameInteractor getChangeV7NameInteractor() {
        ChangeV7NameInteractor changeV7NameInteractor = this.changeV7NameInteractor;
        if (changeV7NameInteractor != null) {
            return changeV7NameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("changeV7NameInteractor");
        return null;
    }

    public final void setChangeV7NameInteractor(ChangeV7NameInteractor changeV7NameInteractor) {
        Intrinsics.checkNotNullParameter(changeV7NameInteractor, "<set-?>");
        this.changeV7NameInteractor = changeV7NameInteractor;
    }
}
