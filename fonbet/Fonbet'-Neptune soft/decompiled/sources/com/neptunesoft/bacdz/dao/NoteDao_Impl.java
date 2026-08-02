package com.neptunesoft.bacdz.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.neptunesoft.bacdz.entities.Note;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class NoteDao_Impl implements NoteDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Note> __insertAdapterOfNote = new EntityInsertAdapter<Note>() { // from class: com.neptunesoft.bacdz.dao.NoteDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `Notes` (`id_note`,`title`,`date_time`,`subtitle`,`note_content`,`image_path`,`color`,`web_link`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertAdapter
        public void bind(final SQLiteStatement statement, final Note entity) {
            statement.mo230bindLong(1, entity.getId_note());
            if (entity.getTitle() == null) {
                statement.mo231bindNull(2);
            } else {
                statement.mo232bindText(2, entity.getTitle());
            }
            if (entity.getDate_time() == null) {
                statement.mo231bindNull(3);
            } else {
                statement.mo232bindText(3, entity.getDate_time());
            }
            if (entity.getSubtitle() == null) {
                statement.mo231bindNull(4);
            } else {
                statement.mo232bindText(4, entity.getSubtitle());
            }
            if (entity.getNote_content() == null) {
                statement.mo231bindNull(5);
            } else {
                statement.mo232bindText(5, entity.getNote_content());
            }
            if (entity.getImage_path() == null) {
                statement.mo231bindNull(6);
            } else {
                statement.mo232bindText(6, entity.getImage_path());
            }
            if (entity.getColor() == null) {
                statement.mo231bindNull(7);
            } else {
                statement.mo232bindText(7, entity.getColor());
            }
            if (entity.getWeb_link() == null) {
                statement.mo231bindNull(8);
            } else {
                statement.mo232bindText(8, entity.getWeb_link());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<Note> __deleteAdapterOfNote = new EntityDeleteOrUpdateAdapter<Note>() { // from class: com.neptunesoft.bacdz.dao.NoteDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        protected String createQuery() {
            return "DELETE FROM `Notes` WHERE `id_note` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(final SQLiteStatement statement, final Note entity) {
            statement.mo230bindLong(1, entity.getId_note());
        }
    };

    public NoteDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
    }

    @Override // com.neptunesoft.bacdz.dao.NoteDao
    public void insertNote(final Note note) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.neptunesoft.bacdz.dao.NoteDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoteDao_Impl.this.m776lambda$insertNote$0$comneptunesoftbacdzdaoNoteDao_Impl(note, (SQLiteConnection) obj);
            }
        });
    }

    /* renamed from: lambda$insertNote$0$com-neptunesoft-bacdz-dao-NoteDao_Impl, reason: not valid java name */
    /* synthetic */ Object m776lambda$insertNote$0$comneptunesoftbacdzdaoNoteDao_Impl(Note note, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfNote.insert(sQLiteConnection, (SQLiteConnection) note);
        return null;
    }

    @Override // com.neptunesoft.bacdz.dao.NoteDao
    public void deleteNote(final Note Note) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.neptunesoft.bacdz.dao.NoteDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoteDao_Impl.this.m775lambda$deleteNote$1$comneptunesoftbacdzdaoNoteDao_Impl(Note, (SQLiteConnection) obj);
            }
        });
    }

    /* renamed from: lambda$deleteNote$1$com-neptunesoft-bacdz-dao-NoteDao_Impl, reason: not valid java name */
    /* synthetic */ Object m775lambda$deleteNote$1$comneptunesoftbacdzdaoNoteDao_Impl(Note note, SQLiteConnection sQLiteConnection) {
        this.__deleteAdapterOfNote.handle(sQLiteConnection, note);
        return null;
    }

    @Override // com.neptunesoft.bacdz.dao.NoteDao
    public List<Note> getAllNotes() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.neptunesoft.bacdz.dao.NoteDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoteDao_Impl.lambda$getAllNotes$2((SQLiteConnection) obj);
            }
        });
    }

    static /* synthetic */ List lambda$getAllNotes$2(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM Notes ORDER BY id_note DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id_note");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "title");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "date_time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "subtitle");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "note_content");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "image_path");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, TypedValues.Custom.S_COLOR);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "web_link");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                Note note = new Note();
                note.setId_note((int) prepare.getLong(columnIndexOrThrow));
                String str = null;
                note.setTitle(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2));
                note.setDate_time(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3));
                note.setSubtitle(prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4));
                note.setNote_content(prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5));
                note.setImage_path(prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6));
                note.setColor(prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7));
                if (!prepare.isNull(columnIndexOrThrow8)) {
                    str = prepare.getText(columnIndexOrThrow8);
                }
                note.setWeb_link(str);
                arrayList.add(note);
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }
}
