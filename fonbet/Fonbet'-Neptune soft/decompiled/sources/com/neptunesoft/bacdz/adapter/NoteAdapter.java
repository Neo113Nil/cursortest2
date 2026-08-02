package com.neptunesoft.bacdz.adapter;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.makeramen.roundedimageview.RoundedImageView;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.adapter.NoteAdapter;
import com.neptunesoft.bacdz.entities.Note;
import com.neptunesoft.bacdz.listeners.NotesListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class NoteAdapter extends RecyclerView.Adapter<NoteViewHolder> {
    private List<Note> notes;
    private final NotesListener notesListener;
    private final List<Note> notesSource;
    private Timer timer;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position;
    }

    public NoteAdapter(List<Note> notes, NotesListener notesListener) {
        this.notes = notes;
        this.notesListener = notesListener;
        this.notesSource = notes;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NoteViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_notes, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(NoteViewHolder holder, final int position) {
        holder.setNote(this.notes.get(position));
        holder.layoutNote.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.adapter.NoteAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoteAdapter.this.m768x6ac5d380(position, view);
            }
        });
    }

    /* renamed from: lambda$onBindViewHolder$0$com-neptunesoft-bacdz-adapter-NoteAdapter, reason: not valid java name */
    /* synthetic */ void m768x6ac5d380(int i, View view) {
        this.notesListener.onNoteClick(this.notes.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.notes.size();
    }

    static class NoteViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView imageNote;
        LinearLayout layoutNote;
        TextView textDateTime;
        TextView textSubtitle;
        TextView textTitle;

        public NoteViewHolder(View itemView) {
            super(itemView);
            this.textTitle = (TextView) itemView.findViewById(R.id.textTitle);
            this.textSubtitle = (TextView) itemView.findViewById(R.id.textSubtitle);
            this.textDateTime = (TextView) itemView.findViewById(R.id.textDateTime);
            this.layoutNote = (LinearLayout) itemView.findViewById(R.id.layoutNote);
            this.imageNote = (RoundedImageView) itemView.findViewById(R.id.imageNote);
        }

        void setNote(Note note) {
            this.textTitle.setText(note.getTitle());
            if (note.getSubtitle().trim().isEmpty()) {
                this.textSubtitle.setVisibility(8);
            } else {
                this.textSubtitle.setText(note.getSubtitle());
            }
            this.textDateTime.setText(note.getDate_time());
            GradientDrawable gradientDrawable = (GradientDrawable) this.layoutNote.getBackground();
            if (note.getColor() != null) {
                gradientDrawable.setColor(Color.parseColor(note.getColor()));
            } else {
                gradientDrawable.setColor(Color.parseColor("#8E94F2"));
            }
            if (note.getImage_path() != null) {
                this.imageNote.setImageBitmap(BitmapFactory.decodeFile(note.getImage_path()));
                this.imageNote.setVisibility(0);
            } else {
                this.imageNote.setVisibility(8);
            }
        }
    }

    /* renamed from: com.neptunesoft.bacdz.adapter.NoteAdapter$1, reason: invalid class name */
    class AnonymousClass1 extends TimerTask {
        final /* synthetic */ String val$searchKeyword;

        AnonymousClass1(final String val$searchKeyword) {
            this.val$searchKeyword = val$searchKeyword;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.val$searchKeyword.trim().isEmpty()) {
                NoteAdapter noteAdapter = NoteAdapter.this;
                noteAdapter.notes = noteAdapter.notesSource;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Note note : NoteAdapter.this.notesSource) {
                    if (note.getColor().contains(this.val$searchKeyword)) {
                        arrayList.add(note);
                    }
                }
                NoteAdapter.this.notes = arrayList;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.neptunesoft.bacdz.adapter.NoteAdapter$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NoteAdapter.AnonymousClass1.this.m769lambda$run$0$comneptunesoftbacdzadapterNoteAdapter$1();
                }
            });
        }

        /* renamed from: lambda$run$0$com-neptunesoft-bacdz-adapter-NoteAdapter$1, reason: not valid java name */
        /* synthetic */ void m769lambda$run$0$comneptunesoftbacdzadapterNoteAdapter$1() {
            NoteAdapter.this.notifyDataSetChanged();
        }
    }

    public void searchNotes(final String searchKeyword, boolean colors) {
        if (colors) {
            Timer timer = new Timer();
            this.timer = timer;
            timer.schedule(new AnonymousClass1(searchKeyword), 0L);
        } else {
            Timer timer2 = new Timer();
            this.timer = timer2;
            timer2.schedule(new AnonymousClass2(searchKeyword), 0L);
        }
    }

    /* renamed from: com.neptunesoft.bacdz.adapter.NoteAdapter$2, reason: invalid class name */
    class AnonymousClass2 extends TimerTask {
        final /* synthetic */ String val$searchKeyword;

        AnonymousClass2(final String val$searchKeyword) {
            this.val$searchKeyword = val$searchKeyword;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.val$searchKeyword.trim().isEmpty()) {
                NoteAdapter noteAdapter = NoteAdapter.this;
                noteAdapter.notes = noteAdapter.notesSource;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Note note : NoteAdapter.this.notesSource) {
                    if (note.getTitle().toLowerCase().contains(this.val$searchKeyword.toLowerCase()) || note.getSubtitle().toLowerCase().contains(this.val$searchKeyword.toLowerCase()) || note.getNote_content().toLowerCase().contains(this.val$searchKeyword.toLowerCase())) {
                        arrayList.add(note);
                    }
                }
                NoteAdapter.this.notes = arrayList;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.neptunesoft.bacdz.adapter.NoteAdapter$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NoteAdapter.AnonymousClass2.this.m770lambda$run$0$comneptunesoftbacdzadapterNoteAdapter$2();
                }
            });
        }

        /* renamed from: lambda$run$0$com-neptunesoft-bacdz-adapter-NoteAdapter$2, reason: not valid java name */
        /* synthetic */ void m770lambda$run$0$comneptunesoftbacdzadapterNoteAdapter$2() {
            NoteAdapter.this.notifyDataSetChanged();
        }
    }

    public void cancelTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
    }
}
