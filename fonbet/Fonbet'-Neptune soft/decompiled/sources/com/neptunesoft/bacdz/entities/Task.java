package com.neptunesoft.bacdz.entities;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class Task implements Serializable {
    private boolean checked;
    private String date_time_created;
    private String date_time_reminder;
    private int id_task;
    private boolean reminded;
    private String task;

    public int getId_task() {
        return this.id_task;
    }

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDate_time_created() {
        return this.date_time_created;
    }

    public void setDate_time_created(String date_time_created) {
        this.date_time_created = date_time_created;
    }

    public String getDate_time_reminder() {
        return this.date_time_reminder;
    }

    public void setDate_time_reminder(String date_time_reminder) {
        this.date_time_reminder = date_time_reminder;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isReminded() {
        return this.reminded;
    }

    public void setReminded(boolean reminded) {
        this.reminded = reminded;
    }

    public String toString() {
        return this.task + " : " + this.date_time_created;
    }
}
