package com.onesignal.session.internal;

import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.ISessionManager;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class SessionManager implements ISessionManager {
    private final IOutcomeEventsController _outcomeController;

    public SessionManager(IOutcomeEventsController _outcomeController) {
        i.e(_outcomeController, "_outcomeController");
        this._outcomeController = _outcomeController;
    }

    @Override // com.onesignal.session.ISessionManager
    public void addOutcome(String name) {
        i.e(name, "name");
        Logging.log(LogLevel.DEBUG, "sendOutcome(name: " + name + ')');
        ThreadUtilsKt.suspendifyOnIO(new SessionManager$addOutcome$1(this, name, null));
    }

    @Override // com.onesignal.session.ISessionManager
    public void addOutcomeWithValue(String name, float f3) {
        i.e(name, "name");
        Logging.log(LogLevel.DEBUG, "sendOutcomeWithValue(name: " + name + ", value: " + f3 + ')');
        ThreadUtilsKt.suspendifyOnIO(new SessionManager$addOutcomeWithValue$1(this, name, f3, null));
    }

    @Override // com.onesignal.session.ISessionManager
    public void addUniqueOutcome(String name) {
        i.e(name, "name");
        Logging.log(LogLevel.DEBUG, "sendUniqueOutcome(name: " + name + ')');
        ThreadUtilsKt.suspendifyOnIO(new SessionManager$addUniqueOutcome$1(this, name, null));
    }
}
