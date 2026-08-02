package androidx.media3.session;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class SessionCommands {
    public static final SessionCommands EMPTY = new Builder().build();
    private static final String FIELD_SESSION_COMMANDS = Util.intToStringMaxRadix(0);
    private static final String TAG = "SessionCommands";
    public final com.google.common.collect.M<SessionCommand> commands;

    public static final class Builder {
        private final Set<SessionCommand> commands;

        private void addCommandCodes(List<Integer> list) {
            for (int i = 0; i < list.size(); i++) {
                add(new SessionCommand(list.get(i).intValue()));
            }
        }

        public Builder add(SessionCommand sessionCommand) {
            this.commands.add((SessionCommand) Assertions.checkNotNull(sessionCommand));
            return this;
        }

        public Builder addAllLibraryCommands() {
            addCommandCodes(SessionCommand.LIBRARY_COMMANDS);
            return this;
        }

        public Builder addAllPredefinedCommands() {
            addAllSessionCommands();
            addAllLibraryCommands();
            return this;
        }

        public Builder addAllSessionCommands() {
            addCommandCodes(SessionCommand.SESSION_COMMANDS);
            return this;
        }

        public Builder addSessionCommands(Collection<SessionCommand> collection) {
            this.commands.addAll(collection);
            return this;
        }

        public SessionCommands build() {
            return new SessionCommands(this.commands);
        }

        public Builder remove(SessionCommand sessionCommand) {
            this.commands.remove(Assertions.checkNotNull(sessionCommand));
            return this;
        }

        public Builder() {
            this.commands = new HashSet();
        }

        public Builder add(int i) {
            Assertions.checkArgument(i != 0);
            this.commands.add(new SessionCommand(i));
            return this;
        }

        public Builder remove(int i) {
            Assertions.checkArgument(i != 0);
            Iterator<SessionCommand> it = this.commands.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SessionCommand next = it.next();
                if (next.commandCode == i) {
                    this.commands.remove(next);
                    break;
                }
            }
            return this;
        }

        private Builder(SessionCommands sessionCommands) {
            this.commands = new HashSet(((SessionCommands) Assertions.checkNotNull(sessionCommands)).commands);
        }
    }

    private static boolean containsCommandCode(Collection<SessionCommand> collection, int i) {
        Iterator<SessionCommand> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().commandCode == i) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public static SessionCommands fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_SESSION_COMMANDS);
        if (parcelableArrayList == null) {
            Log.w(TAG, "Missing commands. Creating an empty SessionCommands");
            return EMPTY;
        }
        Builder builder = new Builder();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            builder.add(SessionCommand.fromBundle((Bundle) parcelableArrayList.get(i)));
        }
        return builder.build();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean contains(SessionCommand sessionCommand) {
        return this.commands.contains(Assertions.checkNotNull(sessionCommand));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionCommands) {
            return this.commands.equals(((SessionCommands) obj).commands);
        }
        return false;
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.commands);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.common.collect.y0<SessionCommand> it = this.commands.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        bundle.putParcelableArrayList(FIELD_SESSION_COMMANDS, arrayList);
        return bundle;
    }

    private SessionCommands(Collection<SessionCommand> collection) {
        this.commands = com.google.common.collect.M.j(collection);
    }

    public boolean contains(int i) {
        Assertions.checkArgument(i != 0, "Use contains(Command) for custom command");
        return containsCommandCode(this.commands, i);
    }
}
