package com.neptunesoft.bacdz.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.makeramen.roundedimageview.RoundedImageView;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.SplashScreen;
import com.neptunesoft.bacdz.classobjects.Quiz;
import com.neptunesoft.bacdz.listeners.QuizListener;
import java.util.List;

/* loaded from: classes4.dex */
public class QuizAdapter extends RecyclerView.Adapter<QuizViewHolder> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Bitmap bitmapquizmidjahidine;
    public static Bitmap bitmapquizmihistory;
    private final List<Quiz> quiz;
    private final QuizListener quizListener;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position;
    }

    public QuizAdapter(List<Quiz> quiz, QuizListener quizListener, Context context) {
        this.quiz = quiz;
        this.quizListener = quizListener;
        if (SplashScreen.darkmode) {
            bitmapquizmidjahidine = getBitmapFromVectorDrawable(context, R.drawable.quizmidjahidine_dark);
            bitmapquizmihistory = getBitmapFromVectorDrawable(context, R.drawable.quizmihistory_dark);
        } else {
            bitmapquizmidjahidine = getBitmapFromVectorDrawable(context, R.drawable.quizmidjahidine);
            bitmapquizmihistory = getBitmapFromVectorDrawable(context, R.drawable.quizmihistory);
        }
    }

    public static Bitmap getBitmapFromVectorDrawable(Context context, int drawableId) {
        Drawable drawable = ContextCompat.getDrawable(context, drawableId);
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public QuizViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new QuizViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_quiz, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(QuizViewHolder holder, final int position) {
        holder.setQuiz(this.quiz.get(position));
        holder.layoutQuiz.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.adapter.QuizAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuizAdapter.this.m771x9b47bbd(position, view);
            }
        });
    }

    /* renamed from: lambda$onBindViewHolder$0$com-neptunesoft-bacdz-adapter-QuizAdapter, reason: not valid java name */
    /* synthetic */ void m771x9b47bbd(int i, View view) {
        this.quizListener.onQuizClick(this.quiz.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.quiz.size();
    }

    static class QuizViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView imageQuiz;
        LinearLayout layoutQuiz;
        TextView textTitle;

        public QuizViewHolder(View itemView) {
            super(itemView);
            this.textTitle = (TextView) itemView.findViewById(R.id.textTitle);
            this.imageQuiz = (RoundedImageView) itemView.findViewById(R.id.imageQuiz);
            this.layoutQuiz = (LinearLayout) itemView.findViewById(R.id.layoutQuiz);
        }

        void setQuiz(Quiz quiz) {
            if (SplashScreen.darkmode) {
                this.layoutQuiz.setBackgroundResource(R.drawable.background_resources_dark);
            } else {
                this.layoutQuiz.setBackgroundResource(R.drawable.background_resources);
            }
            this.textTitle.setText(quiz.getTitle());
            if (quiz.getTitle().equals("شخصيات")) {
                this.imageQuiz.setImageBitmap(QuizAdapter.bitmapquizmidjahidine);
            } else {
                this.imageQuiz.setImageBitmap(QuizAdapter.bitmapquizmihistory);
            }
        }
    }
}
