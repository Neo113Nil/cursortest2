package com.onesignal.internal;

import com.onesignal.debug.LogLevel;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class OtelConfigAction {

    public static final class Disable extends OtelConfigAction {
        public static final Disable INSTANCE = new Disable();

        private Disable() {
            super(null);
        }
    }

    public static final class Enable extends OtelConfigAction {
        private final LogLevel logLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enable(LogLevel logLevel) {
            super(null);
            i.e(logLevel, "logLevel");
            this.logLevel = logLevel;
        }

        public static /* synthetic */ Enable copy$default(Enable enable, LogLevel logLevel, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                logLevel = enable.logLevel;
            }
            return enable.copy(logLevel);
        }

        public final LogLevel component1() {
            return this.logLevel;
        }

        public final Enable copy(LogLevel logLevel) {
            i.e(logLevel, "logLevel");
            return new Enable(logLevel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Enable) && this.logLevel == ((Enable) obj).logLevel;
        }

        public final LogLevel getLogLevel() {
            return this.logLevel;
        }

        public int hashCode() {
            return this.logLevel.hashCode();
        }

        public String toString() {
            return "Enable(logLevel=" + this.logLevel + ')';
        }
    }

    public static final class NoChange extends OtelConfigAction {
        public static final NoChange INSTANCE = new NoChange();

        private NoChange() {
            super(null);
        }
    }

    public static final class UpdateLogLevel extends OtelConfigAction {
        private final LogLevel newLevel;
        private final LogLevel oldLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateLogLevel(LogLevel oldLevel, LogLevel newLevel) {
            super(null);
            i.e(oldLevel, "oldLevel");
            i.e(newLevel, "newLevel");
            this.oldLevel = oldLevel;
            this.newLevel = newLevel;
        }

        public static /* synthetic */ UpdateLogLevel copy$default(UpdateLogLevel updateLogLevel, LogLevel logLevel, LogLevel logLevel2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                logLevel = updateLogLevel.oldLevel;
            }
            if ((i2 & 2) != 0) {
                logLevel2 = updateLogLevel.newLevel;
            }
            return updateLogLevel.copy(logLevel, logLevel2);
        }

        public final LogLevel component1() {
            return this.oldLevel;
        }

        public final LogLevel component2() {
            return this.newLevel;
        }

        public final UpdateLogLevel copy(LogLevel oldLevel, LogLevel newLevel) {
            i.e(oldLevel, "oldLevel");
            i.e(newLevel, "newLevel");
            return new UpdateLogLevel(oldLevel, newLevel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateLogLevel)) {
                return false;
            }
            UpdateLogLevel updateLogLevel = (UpdateLogLevel) obj;
            return this.oldLevel == updateLogLevel.oldLevel && this.newLevel == updateLogLevel.newLevel;
        }

        public final LogLevel getNewLevel() {
            return this.newLevel;
        }

        public final LogLevel getOldLevel() {
            return this.oldLevel;
        }

        public int hashCode() {
            return this.newLevel.hashCode() + (this.oldLevel.hashCode() * 31);
        }

        public String toString() {
            return "UpdateLogLevel(oldLevel=" + this.oldLevel + ", newLevel=" + this.newLevel + ')';
        }
    }

    public /* synthetic */ OtelConfigAction(e eVar) {
        this();
    }

    private OtelConfigAction() {
    }
}
