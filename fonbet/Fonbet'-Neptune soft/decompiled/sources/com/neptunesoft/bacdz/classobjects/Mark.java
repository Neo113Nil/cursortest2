package com.neptunesoft.bacdz.classobjects;

/* loaded from: classes4.dex */
public class Mark {
    private final String article;
    private final double assumption;
    private final double behavior;
    private final boolean darkmode;
    private final int factor;
    private final int id_mark;
    private final int id_triple;
    private final double test;

    public Mark(int id_mark, String article, double behavior, double assumption, double test, int factor, int id_triple, boolean darkmode) {
        this.id_mark = id_mark;
        this.article = article;
        this.behavior = behavior;
        this.assumption = assumption;
        this.test = test;
        this.factor = factor;
        this.id_triple = id_triple;
        this.darkmode = darkmode;
    }

    public int getId_mark() {
        return this.id_mark;
    }

    public String getArticle() {
        return this.article;
    }

    public double getBehavior() {
        return this.behavior;
    }

    public double getAssumption() {
        return this.assumption;
    }

    public double getTest() {
        return this.test;
    }

    public int getFactor() {
        return this.factor;
    }

    public int getId_triple() {
        return this.id_triple;
    }

    public boolean isDarkmode() {
        return this.darkmode;
    }
}
