package com.neptunesoft.bacdz.dao;

import com.neptunesoft.bacdz.entities.Note;
import java.util.List;

/* loaded from: classes4.dex */
public interface NoteDao {
    void deleteNote(Note Note);

    List<Note> getAllNotes();

    void insertNote(Note note);
}
