package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Y7 extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    private final IronSourceError f8024a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7(IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8024a = error;
    }

    public final IronSourceError a() {
        return this.f8024a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(Y7.class, obj.getClass())) {
            return false;
        }
        Y7 y7 = (Y7) obj;
        if (this.f8024a.getErrorCode() != y7.f8024a.getErrorCode()) {
            return false;
        }
        return Intrinsics.areEqual(this.f8024a.getErrorMessage(), y7.f8024a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8024a.getErrorCode()), this.f8024a.getErrorMessage());
    }
}
