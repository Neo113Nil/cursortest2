package com.onesignal.user.internal.builduser;

import com.onesignal.core.internal.operations.Operation;
import java.util.List;

/* loaded from: classes.dex */
public interface IRebuildUserService {
    List<Operation> getRebuildOperationsIfCurrentUser(String str, String str2);
}
