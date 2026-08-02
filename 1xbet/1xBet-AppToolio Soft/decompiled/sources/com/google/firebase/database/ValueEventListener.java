package com.google.firebase.database;

import android.support.annotation.NonNull;

/* loaded from: classes.dex */
public interface ValueEventListener {
    void onCancelled(@NonNull DatabaseError databaseError);

    void onDataChange(@NonNull DataSnapshot dataSnapshot);
}
