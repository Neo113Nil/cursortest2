package org.betup.model.remote.entity.support;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class FAQDataModel implements Parcelable {
    public static final Parcelable.Creator<FAQDataModel> CREATOR = new Parcelable.Creator<FAQDataModel>() { // from class: org.betup.model.remote.entity.support.FAQDataModel.1
        @Override // android.os.Parcelable.Creator
        public FAQDataModel createFromParcel(Parcel in) {
            return new FAQDataModel(in);
        }

        @Override // android.os.Parcelable.Creator
        public FAQDataModel[] newArray(int size) {
            return new FAQDataModel[size];
        }
    };

    @SerializedName("answer")
    private String answer;

    @SerializedName("question")
    private String question;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected FAQDataModel(Parcel in) {
        this.question = in.readString();
        this.answer = in.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.question);
        dest.writeString(this.answer);
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
